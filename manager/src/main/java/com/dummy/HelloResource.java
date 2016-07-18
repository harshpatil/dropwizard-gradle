package com.dummy;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * Created by HarshPatil on 7/19/16.
 */
@Path("/hello")
public class HelloResource {

    @GET
    public String sayHello(@QueryParam("name") @DefaultValue("Starnger") String name) throws Exception {

        return "Hello :: " + name + " !!!";
    }
}
