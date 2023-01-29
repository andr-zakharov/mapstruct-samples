package com.epmp.demo.unexpectedgrpcfields;

import com.epmp.demo.PersonCodegen;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(
    builder = @Builder(disableBuilder = false),
    collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
    nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
    unmappedSourcePolicy = ReportingPolicy.ERROR
)
public interface UnexpectedGrpcFieldMapper {
  UnexpectedGrpcFieldMapper INSTANCE = Mappers.getMapper(UnexpectedGrpcFieldMapper.class);

//  @Mapping(target = "mergeFrom", ignore = true)
//  @Mapping(target = "clearField", ignore = true)
//  @Mapping(target = "clearOneof", ignore = true)
//  @Mapping(target = "unknownFields", ignore = true)
//  @Mapping(target = "mergeUnknownFields", ignore = true)
//  @Mapping(target = "allFields", ignore = true)


  UnexpectedGrpcField fromCodegen(PersonCodegen src);

  default void init(PersonCodegen src) {
//    src.
  }
}
