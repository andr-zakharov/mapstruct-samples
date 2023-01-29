package com.epmp.demo.nullabeinteropfield;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Getter
@Setter
@EqualsAndHashCode
public class PersonNullableFieldInterop {
  String name;
  String sureName;
}
