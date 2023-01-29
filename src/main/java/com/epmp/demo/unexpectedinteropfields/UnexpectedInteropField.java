package com.epmp.demo.unexpectedinteropfields;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Getter
@Setter
@EqualsAndHashCode
public class UnexpectedInteropField {
  String firstName;
  String lastName;
//   failed on the maven.build stage
//  String unexpectedInteropField;
}
