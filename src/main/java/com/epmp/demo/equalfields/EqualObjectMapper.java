package com.epmp.demo.equalfields;

import com.epmp.demo.EqualObjectCodegen;
import com.epmp.demo.person.PersonMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {PersonMapper.class})
public interface EqualObjectMapper {
  EqualObjectMapper INSTANCE = Mappers.getMapper(EqualObjectMapper.class);

  EqualObjectInterop fromCodegen(EqualObjectCodegen src);
}
