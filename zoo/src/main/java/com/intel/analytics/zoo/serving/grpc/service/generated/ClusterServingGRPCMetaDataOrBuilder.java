// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontEndGRPC.proto

package com.intel.analytics.zoo.serving.grpc.service.generated;

public interface ClusterServingGRPCMetaDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.ClusterServingGRPCMetaData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string modelName = 1;</code>
   */
  String getModelName();
  /**
   * <code>optional string modelName = 1;</code>
   */
  com.google.protobuf.ByteString
      getModelNameBytes();

  /**
   * <code>optional string modelVersion = 2;</code>
   */
  String getModelVersion();
  /**
   * <code>optional string modelVersion = 2;</code>
   */
  com.google.protobuf.ByteString
      getModelVersionBytes();

  /**
   * <code>optional string redisHost = 3;</code>
   */
  String getRedisHost();
  /**
   * <code>optional string redisHost = 3;</code>
   */
  com.google.protobuf.ByteString
      getRedisHostBytes();

  /**
   * <code>optional string redisPort = 4;</code>
   */
  String getRedisPort();
  /**
   * <code>optional string redisPort = 4;</code>
   */
  com.google.protobuf.ByteString
      getRedisPortBytes();

  /**
   * <code>optional string redisInputQueue = 5;</code>
   */
  String getRedisInputQueue();
  /**
   * <code>optional string redisInputQueue = 5;</code>
   */
  com.google.protobuf.ByteString
      getRedisInputQueueBytes();

  /**
   * <code>optional string redisOutputQueue = 6;</code>
   */
  String getRedisOutputQueue();
  /**
   * <code>optional string redisOutputQueue = 6;</code>
   */
  com.google.protobuf.ByteString
      getRedisOutputQueueBytes();

  /**
   * <code>optional int32 timeWindow = 7;</code>
   */
  int getTimeWindow();

  /**
   * <code>optional int32 countWindow = 8;</code>
   */
  int getCountWindow();

  /**
   * <code>optional bool redisSecureEnabled = 9;</code>
   */
  boolean getRedisSecureEnabled();

  /**
   * <code>optional string redisTrustStorePath = 10;</code>
   */
  String getRedisTrustStorePath();
  /**
   * <code>optional string redisTrustStorePath = 10;</code>
   */
  com.google.protobuf.ByteString
      getRedisTrustStorePathBytes();

  /**
   * <code>optional string redisTrustStoreToken = 11;</code>
   */
  String getRedisTrustStoreToken();
  /**
   * <code>optional string redisTrustStoreToken = 11;</code>
   */
  com.google.protobuf.ByteString
      getRedisTrustStoreTokenBytes();

  /**
   * <code>optional string features = 12;</code>
   */
  String getFeatures();
  /**
   * <code>optional string features = 12;</code>
   */
  com.google.protobuf.ByteString
      getFeaturesBytes();
}