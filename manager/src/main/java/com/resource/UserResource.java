package com.resource;

import com.models.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by HarshPatil on 7/20/16.
 */
@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {


    @GET
    @Path("/{phoneNumber}")
    public User getUser(@PathParam("phoneNumber") String phoneNumber) {

        User user = new User();
        user.setEmailId("patil.bmsce@gmail.com");
        user.setPhoneNumber("9916133076");
        User.Meta meta = new User.Meta();
        meta.setServiceProvider("Vodafone");
        meta.setState("Karnataka");
        user.setMeta(meta);
        return user;
    }

    @PUT
    @Path("/{phoneNumber}")
    public User createOrUpdateUser(@PathParam("phoneNumber") String phoneNumber, User user) {
        if (!phoneNumber.equals(user.getPhoneNumber())) {
            throw new BadRequestException("Mismatching phone numbers");
        }
        return user;
    }

}
