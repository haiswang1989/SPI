package com.jdk.spi.api.impl;

import com.jdk.spi.api.ISpi;

/**
 * 
 * <p>Description:</p>
 * @author hansen.wang
 * @date 2018年4月19日 上午11:31:59
 */
public class SpiImpl implements ISpi{
    
    @Override
    public void whoAreYou() {
        System.out.println("I am impl one");
    }
    
}
