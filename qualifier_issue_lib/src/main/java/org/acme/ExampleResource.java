package org.acme;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Events")
public class ExampleResource {

    @Inject
    @NormalEvent
    Event<String> normalEvent;

    int normalCount = 0;

    @Inject
    @ImportantEvent
    Event<String> importantEvent;

    int importantCount = 0;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/Normal")
    public String normal() {
        normalEvent.fire("Normal event message " + normalCount);
        return "Triggered normal event " + normalCount++;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/Important")
    public String important() {
        importantEvent.fire("Important event message " + importantCount);
        return "Triggered important event " + importantCount++;
    }
}