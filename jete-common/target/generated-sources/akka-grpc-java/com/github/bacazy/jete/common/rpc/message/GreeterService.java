
// Generated by Akka gRPC. DO NOT EDIT.
package com.github.bacazy.jete.common.rpc.message;

import akka.grpc.ProtobufSerializer;
import akka.grpc.javadsl.GoogleProtobufSerializer;

/**
 * #services
 * //////////////////////////////////// The greeting service definition.
 */
public interface GreeterService {
  
  /**
   * ////////////////////
   * Sends a greeting //
   * //////&#42;****&#47;////////
   *      HELLO       //
   * //////&#42;****&#47;////////
   */
  java.util.concurrent.CompletionStage<com.github.bacazy.jete.common.rpc.message.HelloReply> sayHello(com.github.bacazy.jete.common.rpc.message.HelloRequest in);
  
  /**
   * Comment spanning
   * on several lines
   */
  java.util.concurrent.CompletionStage<com.github.bacazy.jete.common.rpc.message.HelloReply> itKeepsTalking(akka.stream.javadsl.Source<com.github.bacazy.jete.common.rpc.message.HelloRequest, akka.NotUsed> in);
  
  /**
   *  C style comments
   */
  akka.stream.javadsl.Source<com.github.bacazy.jete.common.rpc.message.HelloReply, akka.NotUsed> itKeepsReplying(com.github.bacazy.jete.common.rpc.message.HelloRequest in);
  
  /**
   * C style comments
   * on several lines
   * with non-empty heading/trailing line    */
  akka.stream.javadsl.Source<com.github.bacazy.jete.common.rpc.message.HelloReply, akka.NotUsed> streamHellos(akka.stream.javadsl.Source<com.github.bacazy.jete.common.rpc.message.HelloRequest, akka.NotUsed> in);
  

  static String name = "helloworld.GreeterService";

  public static class Serializers {
    
      public static ProtobufSerializer<com.github.bacazy.jete.common.rpc.message.HelloRequest> HelloRequestSerializer = new GoogleProtobufSerializer<>(com.github.bacazy.jete.common.rpc.message.HelloRequest.class);
    
      public static ProtobufSerializer<com.github.bacazy.jete.common.rpc.message.HelloReply> HelloReplySerializer = new GoogleProtobufSerializer<>(com.github.bacazy.jete.common.rpc.message.HelloReply.class);
    
  }
}
