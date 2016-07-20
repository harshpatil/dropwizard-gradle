package com.dummy;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

/**
 * Created by HarshPatil on 7/19/16.
 */
public class ManagerApplication extends Application<ManagerConfiguration> {

    public void run(ManagerConfiguration configuration, Environment environment) throws Exception {

        System.out.println("Reading from config.yaml ::: "+configuration.getName());
        environment.getObjectMapper();
        environment.jersey();
        environment.jersey().register(new HelloResource());
    }

    public static void main(String[] args) throws Exception {
        new ManagerApplication().run(args);
    }

}
