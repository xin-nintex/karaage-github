package com.nintex.xin;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("healthcheck")
public class HealthCheck {
    @GET
    @Produces("text/plain")
    public String ok(){
        return "Ok";
    }
}
