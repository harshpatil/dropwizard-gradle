package com.dummy;

import io.dropwizard.Configuration;

/**
 * Created by HarshPatil on 7/19/16.
 */
public class ManagerConfiguration extends Configuration{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
