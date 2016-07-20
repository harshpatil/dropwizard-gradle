package com.resource;

import com.dropwizard.ManagerConfiguration;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * Created by HarshPatil on 7/19/16.
 */
@Path("/hello")
public class HelloResource {

    private final ManagerConfiguration managerConfiguration;

    public HelloResource(ManagerConfiguration managerConfiguration) {
        this.managerConfiguration = managerConfiguration;
    }

    @GET
    public String sayHello(@QueryParam("name") @DefaultValue("Starnger") String name) throws Exception {

        return "Hello :: " + name + " !!! Welcome to ::: " + managerConfiguration.getName() + " Application";
    }
}
