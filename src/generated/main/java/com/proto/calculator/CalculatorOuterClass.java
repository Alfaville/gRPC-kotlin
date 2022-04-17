// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculator/calculator.proto

package com.proto.calculator;

public final class CalculatorOuterClass {
  private CalculatorOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dummy_Calculator_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dummy_Calculator_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dummy_CalculatorRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dummy_CalculatorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dummy_CalculatorResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dummy_CalculatorResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dummy_CalculatorManyTimesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dummy_CalculatorManyTimesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dummy_CalculatorManyTimesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dummy_CalculatorManyTimesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dummy_PrimeNumber_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dummy_PrimeNumber_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dummy_PrimeNumberDecompositionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dummy_PrimeNumberDecompositionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dummy_PrimeNumberDecompositionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dummy_PrimeNumberDecompositionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dummy_LongCalculatorRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dummy_LongCalculatorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dummy_LongCalculatorResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dummy_LongCalculatorResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dummy_FindMaxNumberRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dummy_FindMaxNumberRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dummy_FindMaxNumberResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dummy_FindMaxNumberResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dummy_SquareRootRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dummy_SquareRootRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dummy_SquareRootResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dummy_SquareRootResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033calculator/calculator.proto\022\005dummy\"\"\n\n" +
      "Calculator\022\t\n\001x\030\001 \001(\003\022\t\n\001y\030\002 \001(\003\":\n\021Calc" +
      "ulatorRequest\022%\n\ncalculator\030\001 \001(\0132\021.dumm" +
      "y.Calculator\"$\n\022CalculatorResponse\022\016\n\006re" +
      "sult\030\001 \001(\003\"C\n\032CalculatorManyTimesRequest" +
      "\022%\n\ncalculator\030\001 \001(\0132\021.dummy.Calculator\"" +
      "-\n\033CalculatorManyTimesResponse\022\016\n\006result" +
      "\030\001 \001(\003\"\030\n\013PrimeNumber\022\t\n\001x\030\001 \001(\003\"J\n\037Prim" +
      "eNumberDecompositionRequest\022\'\n\013primeNumb" +
      "er\030\001 \001(\0132\022.dummy.PrimeNumber\"2\n PrimeNum" +
      "berDecompositionResponse\022\016\n\006result\030\001 \001(\003" +
      "\">\n\025LongCalculatorRequest\022%\n\ncalculator\030" +
      "\001 \001(\0132\021.dummy.Calculator\"(\n\026LongCalculat" +
      "orResponse\022\016\n\006result\030\001 \001(\001\"&\n\024FindMaxNum" +
      "berRequest\022\016\n\006number\030\001 \001(\005\"(\n\025FindMaxNum" +
      "berResponse\022\017\n\007maximum\030\001 \001(\005\"#\n\021SquareRo" +
      "otRequest\022\016\n\006number\030\001 \001(\005\")\n\022SquareRootR" +
      "esponse\022\023\n\013number_root\030\001 \001(\0012\232\004\n\021Calcula" +
      "torService\022C\n\nCalculator\022\030.dummy.Calcula" +
      "torRequest\032\031.dummy.CalculatorResponse\"\000\022" +
      "`\n\023CalculatorManyTimes\022!.dummy.Calculato" +
      "rManyTimesRequest\032\".dummy.CalculatorMany" +
      "TimesResponse\"\0000\001\022o\n\030PrimeNumberDecompos" +
      "ition\022&.dummy.PrimeNumberDecompositionRe" +
      "quest\032\'.dummy.PrimeNumberDecompositionRe" +
      "sponse\"\0000\001\022Q\n\016LongCalculator\022\034.dummy.Lon" +
      "gCalculatorRequest\032\035.dummy.LongCalculato" +
      "rResponse\"\000(\001\022U\n\022FindMaxApiEveryone\022\033.du" +
      "mmy.FindMaxNumberRequest\032\034.dummy.FindMax" +
      "NumberResponse\"\000(\0010\001\022C\n\nSquareRoot\022\030.dum" +
      "my.SquareRootRequest\032\031.dummy.SquareRootR" +
      "esponse\"\000B\030\n\024com.proto.calculatorP\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_dummy_Calculator_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_dummy_Calculator_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dummy_Calculator_descriptor,
        new java.lang.String[] { "X", "Y", });
    internal_static_dummy_CalculatorRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_dummy_CalculatorRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dummy_CalculatorRequest_descriptor,
        new java.lang.String[] { "Calculator", });
    internal_static_dummy_CalculatorResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_dummy_CalculatorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dummy_CalculatorResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_dummy_CalculatorManyTimesRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_dummy_CalculatorManyTimesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dummy_CalculatorManyTimesRequest_descriptor,
        new java.lang.String[] { "Calculator", });
    internal_static_dummy_CalculatorManyTimesResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_dummy_CalculatorManyTimesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dummy_CalculatorManyTimesResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_dummy_PrimeNumber_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_dummy_PrimeNumber_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dummy_PrimeNumber_descriptor,
        new java.lang.String[] { "X", });
    internal_static_dummy_PrimeNumberDecompositionRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_dummy_PrimeNumberDecompositionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dummy_PrimeNumberDecompositionRequest_descriptor,
        new java.lang.String[] { "PrimeNumber", });
    internal_static_dummy_PrimeNumberDecompositionResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_dummy_PrimeNumberDecompositionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dummy_PrimeNumberDecompositionResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_dummy_LongCalculatorRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_dummy_LongCalculatorRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dummy_LongCalculatorRequest_descriptor,
        new java.lang.String[] { "Calculator", });
    internal_static_dummy_LongCalculatorResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_dummy_LongCalculatorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dummy_LongCalculatorResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_dummy_FindMaxNumberRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_dummy_FindMaxNumberRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dummy_FindMaxNumberRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_dummy_FindMaxNumberResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_dummy_FindMaxNumberResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dummy_FindMaxNumberResponse_descriptor,
        new java.lang.String[] { "Maximum", });
    internal_static_dummy_SquareRootRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_dummy_SquareRootRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dummy_SquareRootRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_dummy_SquareRootResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_dummy_SquareRootResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dummy_SquareRootResponse_descriptor,
        new java.lang.String[] { "NumberRoot", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}