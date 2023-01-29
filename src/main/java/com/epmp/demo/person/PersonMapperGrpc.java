package com.epmp.demo.person;

import com.epmp.demo.PersonCodegen;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapperGrpc {
  PersonMapperGrpc INSTANCE = Mappers.getMapper(PersonMapperGrpc.class);

  @Mapping(source = "name", target = "firstName")
  @Mapping(source = "sureName", target = "lastName")
  PersonCodegen toCodegen(PersonInterop src);
}
