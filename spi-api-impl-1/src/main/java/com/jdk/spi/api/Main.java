package com.jdk.spi.api;

import java.util.ServiceLoader;

/**
 * 
 * <p>Description:</p>
 * @author hansen.wang
 * @date 2018年4月19日 上午11:39:54
 */
public class Main {
    
    public static void main(String[] args) {
        ServiceLoader<ISpi> services = ServiceLoader.load(ISpi.class);
        for (ISpi iSpi : services) {
            iSpi.whoAreYou(); //I am impl one
        }
    }
}
