package org.acme.resteasy;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/resteasy/hello")
public class ExampleResource {

//    @Inject
//    ExampleResource a;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@QueryParam("amount")int amount)
    {
        String response = "nothing";
        if(amount>=10)
        {
            System.out.println("kaya");
            response = "rich\n";
        }
        else if(amount<10)
        {
            response = "poor\n";
        }
        return response;
    }

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public String helloJson()
//    {
//        return "hello quarkus sotong";
//    }

//    @GET
//    @Produces(MediaType.TEXT_HTML)
//    public String helloHtml()
//    {
//        String resource = "<h1> Hello from HTML </h1>";
//        return resource;
//    }

}