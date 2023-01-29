package com.epmp.demo.equalfields;

import com.epmp.demo.EqualObjectCodegen;
import com.epmp.demo.person.PersonMapper;
import com.epmp.demo.person.PersonMapperGrpc;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {PersonMapperGrpc.class})
public interface EqualObjectMapperGrpc {
  EqualObjectMapperGrpc INSTANCE = Mappers.getMapper(EqualObjectMapperGrpc.class);

  EqualObjectCodegen toCodegen(EqualObjectInterop src);
}
