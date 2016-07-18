package com.dummy;

/**
 * Created by HarshPatil on 7/19/16.
 */
public class Sample {

    public static void main(String[] args) {
        System.out.println("Hello from a Java Program");
        for (int i=0; i < args.length; i++) {
            System.out.println("args[" + i + "]=" + args[i]);
        }
    }
}
