package jp.jyane.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class Main {
  public Server server;

  public static void main(String args[]) {
    server = ServerBuilder.forPort(10080)
      .build()
      .start();
  }
}
