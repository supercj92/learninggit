package com.cfysu.webservice;

import com.cfysu.webservice.service.impl.HelloServiceImpl;

import javax.xml.ws.Endpoint;

public class HelloServer {
    public static void main(String[] args){
        System.out.println("WebService is starting...");
        HelloServiceImpl helloService = new HelloServiceImpl();
        String address = "http://localhost:9090/hello";
        Endpoint.publish(address, helloService);
        System.out.println("WebService started");
    }
}
