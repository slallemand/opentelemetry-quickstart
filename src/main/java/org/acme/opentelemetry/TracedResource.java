package org.acme.opentelemetry;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import org.jboss.logging.Logger;


@Path("/")
public class TracedResource {

    private static final Logger LOG = Logger.getLogger(TracedResource.class);
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/")
    public String pong() {
        LOG.info("pong");
        return "pong";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/hello")
    public String hello() {
        LOG.info("hello");
        return "hello";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/hello/sebastien")
    public String bonjour() {
        LOG.info("hello/sebastien");
        return "hello sebastien !";
    }
}
