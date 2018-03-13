package io.dargenn.client;

import io.dargenn.HelloWorld;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class ClientV2 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8080/ws/hello?wsdl");
        QName qName = new QName("http://dargenn.io/", "HelloWorldImplService");

        Service service = Service.create(url, qName);
        HelloWorld hello = service.getPort(HelloWorld.class);

        String query = "Client querying...";
        String response = hello.getHelloWorld(query);
        System.out.println(query);
        System.out.println(response);
    }
}
