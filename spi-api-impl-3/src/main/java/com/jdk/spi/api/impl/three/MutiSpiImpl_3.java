package com.jdk.spi.api.impl.three;

import com.jdk.spi.api.ISpi;

/**
 * 
 * <p>Description:</p>
 * @author hansen.wang
 * @date 2018年4月19日 上午11:44:37
 */
public class MutiSpiImpl_3 implements ISpi {
    
    public MutiSpiImpl_3() {
        System.out.println("MutiSpiImpl_3 construct.");
    }
    
    @Override
    public void whoAreYou() {
        System.out.println("MutiSpiImpl_3.");
    }

}
