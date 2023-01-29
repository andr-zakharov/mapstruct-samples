package com.epmp.demo;

import com.epmp.demo.equalfields.EqualObjectMapper;
import com.epmp.demo.equalfields.EqualObjectInterop;
import com.epmp.demo.equalfields.EqualObjectMapperGrpc;
import com.epmp.demo.inheritance.InheritanceBInterop;
import com.epmp.demo.inheritance.InheritanceMapper;
import com.epmp.demo.inheritance.InheritanceMapperGrpc;
import com.epmp.demo.nullableinteropcollection.CollectionInterop;
import com.epmp.demo.nullableinteropcollection.CollectionMapper;
import com.epmp.demo.nullableinteropcollection.CollectionMapperGrpc;
import com.epmp.demo.superbuilders.SuperBuildersBInterop;
import com.epmp.demo.superbuilders.SuperBuildersMapper;
import com.epmp.demo.superbuilders.SuperBuildersMapperGrpc;
import com.epmp.demo.nullabeinteropfield.PersonNullableFieldInterop;
import com.epmp.demo.nullabeinteropfield.PersonNullableFieldMapper;
import com.epmp.demo.nullabeinteropfield.PersonNullableFieldMapperGrpc;
import com.epmp.demo.person.PersonInterop;
import com.epmp.demo.unexpectedinteropfields.UnexpectedInteropField;
import com.epmp.demo.unexpectedinteropfields.UnexpectedInteropFieldMapper;
import com.epmp.demo.unexpectedinteropfields.UnexpectedInteropFieldMapperGrpc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

  @Test
  void equalObjects() {
    EqualObjectInterop source = new EqualObjectInterop()
        .setId("id")
        .setComment("comment")
        .setPerson(new PersonInterop()
            .setName("name")
            .setSureName("surename"));

    EqualObjectCodegen codegenObject = EqualObjectMapperGrpc.INSTANCE.toCodegen(source);
    EqualObjectInterop result = EqualObjectMapper.INSTANCE.fromCodegen(codegenObject);

    Assertions.assertTrue(source.equals(result));
  }

  @Test
  void nullableInteropField() {
    PersonNullableFieldInterop source = new PersonNullableFieldInterop()
        .setName(null)
        .setSureName("surename");


    PersonCodegen codegenObject = PersonNullableFieldMapperGrpc.INSTANCE.toCodegen(source);
    PersonNullableFieldInterop result = PersonNullableFieldMapper.INSTANCE.fromCodegen(codegenObject);

    // source.name = null, result.name = "" >> grpc model has no possible to set null to primitive types.

    Assertions.assertTrue(source.equals(result));
  }

  @Test
  void nullableInteropCollection() {
    CollectionInterop source = new CollectionInterop();

    CollectionCodegen codegenObject = CollectionMapperGrpc.INSTANCE.toCodegen(source);
    CollectionInterop result = CollectionMapper.INSTANCE.fromCodegen(codegenObject);

    Assertions.assertTrue(source.equals(result));
  }

  @Test
  void unexpectedInteropField() {
    UnexpectedInteropField source = new UnexpectedInteropField()
        .setFirstName("firstname")
        .setLastName("lastname");

    PersonCodegen personCodegen = UnexpectedInteropFieldMapperGrpc.INSTANCE.toCodegen(source);
    UnexpectedInteropField result = UnexpectedInteropFieldMapper.INSTANCE.fromCodegen(personCodegen);

    Assertions.assertTrue(source.equals(result));
  }

  @Test
  void unexpectedGrpcField() {

  }

  @Test
  void differendFieldNames() {}

  @Test
  void wrappedGrpcCollection() {}

  @Test
  void generics() {}

  @Test
  void inheritance() {
    InheritanceBInterop source = new InheritanceBInterop();
    source.setParentProperty(12345);
    source.setChildProperty("child_property_value");

    InheritanceBCodegen codegenObject = InheritanceMapperGrpc.INSTANCE.toCodegen(source);
    InheritanceBInterop result = InheritanceMapper.INSTANCE.fromCodegen(codegenObject);

    Assertions.assertTrue(source.equals(result));
  }

  @Test
  void superBuilders() {
    SuperBuildersBInterop source = SuperBuildersBInterop.builder()
        .parentProperty(1)
        .childProperty("extended")
        .build();

    InheritanceBCodegen codegenObject = SuperBuildersMapperGrpc.INSTANCE.toCodegen(source);
    SuperBuildersBInterop result = SuperBuildersMapper.INSTANCE.fromCodegen(codegenObject);

    Assertions.assertTrue(source.equals(result));
  }
}
