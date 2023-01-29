package com.epmp.demo.unexpectedgrpcfields;

import com.epmp.demo.PersonCodegen;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(
    collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
    nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface UnexpectedGrpcFieldMapperGrpc {
  UnexpectedGrpcFieldMapperGrpc INSTANCE = Mappers.getMapper(UnexpectedGrpcFieldMapperGrpc.class);

//  @Mapping(target = "initializationErrorString", ignore = true)
//  @Mapping(target = "descriptorForType", ignore = true)
//  @Mapping(target = "allFields", ignore = true)
//  @Mapping(target = "unknownFields", ignore = true)
//  @Mapping(target = "initialized", ignore = true)
//  @Mapping(target = "defaultInstanceForType", ignore = true)
  PersonCodegen toCodegen(UnexpectedGrpcField src);
}
