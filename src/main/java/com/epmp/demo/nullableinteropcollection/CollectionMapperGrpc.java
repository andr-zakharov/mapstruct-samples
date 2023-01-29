package com.epmp.demo.nullableinteropcollection;

import com.epmp.demo.CollectionCodegen;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(
    collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
    nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface CollectionMapperGrpc {
  CollectionMapperGrpc INSTANCE = Mappers.getMapper(CollectionMapperGrpc.class);

  CollectionCodegen toCodegen(CollectionInterop src);
}
