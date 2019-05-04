package com.example;


import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;

//URI path "/helloworld"
@Path("/helloworld")
public class HelloWorldResource {
    
    
    @GET
    
    @Produces("text/plain")
    public String getClichedMessage() {
       
        return "Hello World : Reema";
    }
}