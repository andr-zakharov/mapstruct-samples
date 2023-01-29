package com.epmp.demo.nullableinteropcollection;

import com.epmp.demo.CollectionCodegen;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CollectionMapper {
  CollectionMapper INSTANCE = Mappers.getMapper(CollectionMapper.class);

  @Mapping(target = "messages", source = "messagesList")
  CollectionInterop fromCodegen(CollectionCodegen src);
}
