package com.jdk.spi.api;

import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {
        
        ServiceLoader<ISpi> serviceloader = ServiceLoader.load(ISpi.class);
        for (ISpi iSpi : serviceloader) {
            iSpi.whoAreYou();
        }
    }

}
