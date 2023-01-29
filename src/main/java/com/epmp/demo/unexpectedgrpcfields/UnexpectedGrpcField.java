package com.epmp.demo.unexpectedgrpcfields;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Getter
@Setter
@EqualsAndHashCode
public class UnexpectedGrpcField {
  String firstName;
//   failed on the maven.build stage
//  String lastName;
}
