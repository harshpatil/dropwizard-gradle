package com.dropwizard;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.resource.HelloResource;
import com.resource.UserResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by HarshPatil on 7/19/16.
 */
public class ManagerApplication extends Application<ManagerConfiguration> {


    @Override
    public void initialize(Bootstrap<ManagerConfiguration> bootstrap) {
        super.initialize(bootstrap);
    }

    public void run(ManagerConfiguration configuration, Environment environment) throws Exception {

        System.out.println("Reading from config.yaml ::: "+configuration.getName());
        environment.getObjectMapper();
        environment.jersey();
        environment.jersey().register(new HelloResource(configuration));
//        environment.getObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL); -> Use this to not include null fields in response
        environment.jersey().register(new UserResource());
    }


    public static void main(String[] args) throws Exception {
        System.out.println("Hello from a Java Program");
        for (int i=0; i < args.length; i++) {
            System.out.println("args[" + i + "]=" + args[i]);
        }
        new ManagerApplication().run(args);
    }
}
