package com.epmp.demo.person;

import com.epmp.demo.PersonCodegen;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper
public interface PersonMapper {

  @Mapping(source = "firstName", target = "name")
  @Mapping(source = "lastName", target = "sureName")
  PersonInterop fromCodegen(PersonCodegen src);
}
