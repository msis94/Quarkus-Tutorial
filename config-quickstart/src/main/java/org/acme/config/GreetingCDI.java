package org.acme.config;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/greetingcdi")
public class GreetingCDI {

    @Inject
    Container container;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String cdi()
    {
        return "You "  + container.getStatus();
    }

}