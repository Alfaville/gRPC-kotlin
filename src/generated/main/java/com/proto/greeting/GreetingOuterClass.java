// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: greeting/greeting.proto

package com.proto.greeting;

public final class GreetingOuterClass {
  private GreetingOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dummy_Greeting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dummy_Greeting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dummy_GreetingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dummy_GreetingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dummy_GreetingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dummy_GreetingResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dummy_GreetingEveryoneRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dummy_GreetingEveryoneRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dummy_GreetingEveryoneResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dummy_GreetingEveryoneResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dummy_GreetingWithDeadlineRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dummy_GreetingWithDeadlineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dummy_GreetingWithDeadlineResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dummy_GreetingWithDeadlineResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027greeting/greeting.proto\022\005dummy\"1\n\010Gree" +
      "ting\022\022\n\nfirst_name\030\001 \001(\t\022\021\n\tlast_name\030\002 " +
      "\001(\t\"4\n\017GreetingRequest\022!\n\010greeting\030\001 \001(\013" +
      "2\017.dummy.Greeting\"\"\n\020GreetingResponse\022\016\n" +
      "\006result\030\001 \001(\t\"<\n\027GreetingEveryoneRequest" +
      "\022!\n\010greeting\030\001 \001(\0132\017.dummy.Greeting\"*\n\030G" +
      "reetingEveryoneResponse\022\016\n\006result\030\001 \001(\t\"" +
      "@\n\033GreetingWithDeadlineRequest\022!\n\010greeti" +
      "ng\030\001 \001(\0132\017.dummy.Greeting\".\n\034GreetingWit" +
      "hDeadlineResponse\022\016\n\006result\030\001 \001(\t2\203\002\n\014Gr" +
      "eetService\022:\n\005Greet\022\026.dummy.GreetingRequ" +
      "est\032\027.dummy.GreetingResponse\"\000\022V\n\rGreetE" +
      "veryone\022\036.dummy.GreetingEveryoneRequest\032" +
      "\037.dummy.GreetingEveryoneResponse\"\000(\0010\001\022_" +
      "\n\022GreetWithDeadLines\022\".dummy.GreetingWit" +
      "hDeadlineRequest\032#.dummy.GreetingWithDea" +
      "dlineResponse\"\000B\026\n\022com.proto.greetingP\001b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_dummy_Greeting_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_dummy_Greeting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dummy_Greeting_descriptor,
        new java.lang.String[] { "FirstName", "LastName", });
    internal_static_dummy_GreetingRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_dummy_GreetingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dummy_GreetingRequest_descriptor,
        new java.lang.String[] { "Greeting", });
    internal_static_dummy_GreetingResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_dummy_GreetingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dummy_GreetingResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_dummy_GreetingEveryoneRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_dummy_GreetingEveryoneRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dummy_GreetingEveryoneRequest_descriptor,
        new java.lang.String[] { "Greeting", });
    internal_static_dummy_GreetingEveryoneResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_dummy_GreetingEveryoneResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dummy_GreetingEveryoneResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_dummy_GreetingWithDeadlineRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_dummy_GreetingWithDeadlineRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dummy_GreetingWithDeadlineRequest_descriptor,
        new java.lang.String[] { "Greeting", });
    internal_static_dummy_GreetingWithDeadlineResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_dummy_GreetingWithDeadlineResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dummy_GreetingWithDeadlineResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
