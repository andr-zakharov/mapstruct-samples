package com.epmp.demo.inheritance;

import com.epmp.demo.InheritanceBCodegen;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface InheritanceMapper {
  InheritanceMapper INSTANCE = Mappers.getMapper(InheritanceMapper.class);

  @Mapping(source = "baseRef", target = ".")
  InheritanceBInterop fromCodegen(InheritanceBCodegen src);
}
