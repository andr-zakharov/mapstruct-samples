package com.epmp.demo.superbuilders;

import com.epmp.demo.InheritanceBCodegen;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(
    collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
    nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface SuperBuildersMapperGrpc {
  SuperBuildersMapperGrpc INSTANCE = Mappers.getMapper(SuperBuildersMapperGrpc.class);
  @Mapping(source = ".", target = "baseRef")
  InheritanceBCodegen toCodegen(SuperBuildersBInterop src);

}
