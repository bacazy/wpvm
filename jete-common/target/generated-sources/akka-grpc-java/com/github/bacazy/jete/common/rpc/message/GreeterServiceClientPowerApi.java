
// Generated by Akka gRPC. DO NOT EDIT.
package com.github.bacazy.jete.common.rpc.message;


import akka.grpc.javadsl.SingleResponseRequestBuilder;
import akka.grpc.javadsl.StreamResponseRequestBuilder;


public abstract class GreeterServiceClientPowerApi {
  
    /**
     * Lower level "lifted" version of the method, giving access to request metadata etc.
     * prefer sayHello(com.github.bacazy.jete.common.rpc.message.HelloRequest) if possible.
     */
    
      public SingleResponseRequestBuilder<com.github.bacazy.jete.common.rpc.message.HelloRequest, com.github.bacazy.jete.common.rpc.message.HelloReply> sayHello()
    
    {
        throw new java.lang.UnsupportedOperationException();
    }
  
    /**
     * Lower level "lifted" version of the method, giving access to request metadata etc.
     * prefer itKeepsTalking(com.github.bacazy.jete.common.rpc.message.HelloRequest) if possible.
     */
    
      public SingleResponseRequestBuilder<akka.stream.javadsl.Source<com.github.bacazy.jete.common.rpc.message.HelloRequest, akka.NotUsed>, com.github.bacazy.jete.common.rpc.message.HelloReply> itKeepsTalking()
    
    {
        throw new java.lang.UnsupportedOperationException();
    }
  
    /**
     * Lower level "lifted" version of the method, giving access to request metadata etc.
     * prefer itKeepsReplying(com.github.bacazy.jete.common.rpc.message.HelloRequest) if possible.
     */
    
      public StreamResponseRequestBuilder<com.github.bacazy.jete.common.rpc.message.HelloRequest, com.github.bacazy.jete.common.rpc.message.HelloReply> itKeepsReplying()
    
    {
        throw new java.lang.UnsupportedOperationException();
    }
  
    /**
     * Lower level "lifted" version of the method, giving access to request metadata etc.
     * prefer streamHellos(com.github.bacazy.jete.common.rpc.message.HelloRequest) if possible.
     */
    
      public StreamResponseRequestBuilder<akka.stream.javadsl.Source<com.github.bacazy.jete.common.rpc.message.HelloRequest, akka.NotUsed>, com.github.bacazy.jete.common.rpc.message.HelloReply> streamHellos()
    
    {
        throw new java.lang.UnsupportedOperationException();
    }
  
}
