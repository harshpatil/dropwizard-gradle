package com.models;


import lombok.Data;

/**
 * Created by HarshPatil on 7/20/16.
 */
@Data
public class User {

    private String phoneNumber;
    private String emailId;
    private Meta meta;

    @Data
    public static class Meta {

        private String state;
        private String serviceProvider;
    }
}
