package com.epmp.demo.superbuilders;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
public class SuperBuildersBInterop extends SuperBuildersAInterop {
    String childProperty;
}
