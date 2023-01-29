package com.epmp.demo.nullabeinteropfield;

import com.epmp.demo.PersonCodegen;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface PersonNullableFieldMapperGrpc {
  PersonNullableFieldMapperGrpc INSTANCE = Mappers.getMapper(PersonNullableFieldMapperGrpc.class);

  @Mapping(source = "name", target = "firstName")
  @Mapping(source = "sureName", target = "lastName")
  PersonCodegen toCodegen(PersonNullableFieldInterop src);
}
