package io.dargenn;

import javax.jws.WebService;

@WebService(endpointInterface = "io.dargenn.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String getHelloWorld(String name) {
        return "Hello world dlugi string!, to name: " + name;
    }
}
