package com.jdk.spi.api.impl.four;

import com.jdk.spi.api.ISpi;

/**
 * 
 * <p>Description:</p>
 * @author hansen.wang
 * @date 2018年4月19日 上午11:44:34
 */
public class MutiSpiImpl_4 implements ISpi {
    
    public MutiSpiImpl_4() {
        System.out.println("MutiSpiImpl_4 constructor");
    }
    
    @Override
    public void whoAreYou() {
        System.out.println("MutiSpiImpl_4.");
    }

}
