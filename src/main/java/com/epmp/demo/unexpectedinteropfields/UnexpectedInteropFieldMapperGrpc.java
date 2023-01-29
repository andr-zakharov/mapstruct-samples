package com.epmp.demo.unexpectedinteropfields;

import com.epmp.demo.PersonCodegen;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedSourcePolicy = ReportingPolicy.ERROR)
public interface UnexpectedInteropFieldMapperGrpc {
  UnexpectedInteropFieldMapperGrpc INSTANCE = Mappers.getMapper(UnexpectedInteropFieldMapperGrpc.class);

  PersonCodegen toCodegen(UnexpectedInteropField src);
}
