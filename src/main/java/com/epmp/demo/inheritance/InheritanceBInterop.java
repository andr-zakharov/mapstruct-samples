package com.epmp.demo.inheritance;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class InheritanceBInterop extends InheritanceAInterop {
    String childProperty;
}
