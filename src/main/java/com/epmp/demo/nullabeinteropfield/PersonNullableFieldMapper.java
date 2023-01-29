package com.epmp.demo.nullabeinteropfield;

import com.epmp.demo.PersonCodegen;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface PersonNullableFieldMapper {
  PersonNullableFieldMapper INSTANCE = Mappers.getMapper(PersonNullableFieldMapper.class);
  @Mapping(source = "firstName", target = "name")
  @Mapping(source = "lastName", target = "sureName")
  PersonNullableFieldInterop fromCodegen(PersonCodegen src);
}
