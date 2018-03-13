package io.dargenn.client;

import io.dargenn.HelloWorld;
import io.dargenn.temp.io.dargenn.HelloWorldImplService;

public class Client {
    public static void main(String[] args) {
        HelloWorldImplService helloService = new HelloWorldImplService();
        HelloWorld hello = helloService.getHelloWorldImplPort();

        String query = "Client querying...";
        String response = hello.getHelloWorld(query);
        System.out.println(query);
        System.out.println(response);
    }
}
