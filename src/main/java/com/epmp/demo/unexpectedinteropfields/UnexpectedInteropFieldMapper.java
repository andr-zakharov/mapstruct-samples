package com.epmp.demo.unexpectedinteropfields;

import com.epmp.demo.PersonCodegen;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper()
public interface UnexpectedInteropFieldMapper {
  UnexpectedInteropFieldMapper INSTANCE = Mappers.getMapper(UnexpectedInteropFieldMapper.class);
  UnexpectedInteropField fromCodegen(PersonCodegen src);
}
