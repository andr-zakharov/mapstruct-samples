package com.epmp.demo.superbuilders;

import com.epmp.demo.InheritanceBCodegen;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SuperBuildersMapper {
  SuperBuildersMapper INSTANCE = Mappers.getMapper(SuperBuildersMapper.class);

  @Mapping(source = "baseRef", target = ".")
  SuperBuildersBInterop fromCodegen(InheritanceBCodegen src);
}
