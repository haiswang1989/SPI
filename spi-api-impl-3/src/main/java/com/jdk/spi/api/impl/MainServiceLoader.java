package com.jdk.spi.api.impl;

import java.util.ServiceLoader;

import com.jdk.spi.api.ISpi;

/**
 * 
 * <p>Description:</p>
 * @author hansen.wang
 * @date 2018年4月19日 上午11:44:59
 */
public class MainServiceLoader {

    public static void main(String[] args) {
        
        System.out.println("start.");
        
        /**
         * com.jdk.spi.api.ISpi接口在该包中有多个实现
         * 
         * 1：dubbo的文档锁JDK原生的SPI在加载扩展点的时候,是一次性把全部的扩展点进行初始化的,
         * 但是实际的测试并非如此,看ServiceLoader的源码,加载扩展类的时候是在ServiceLoader的
         * 内部类LazyIterator的next()方法中进行加载的
         * 
         * 2：JDK原生的SPI不支持给扩展点添加名称
         * 
         */
        ServiceLoader<ISpi> services = ServiceLoader.load(ISpi.class);
        for (ISpi iSpi : services) {
            iSpi.whoAreYou();
        }
    }

}
