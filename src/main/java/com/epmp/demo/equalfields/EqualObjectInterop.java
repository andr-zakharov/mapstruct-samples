package com.epmp.demo.equalfields;

import com.epmp.demo.person.PersonInterop;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Getter
@Setter
@EqualsAndHashCode
public class EqualObjectInterop {
  String id;
  String comment;
  PersonInterop person;
}
