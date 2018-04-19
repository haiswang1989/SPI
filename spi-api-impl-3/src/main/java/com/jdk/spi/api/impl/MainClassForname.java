package com.jdk.spi.api.impl;


/**
 * 
 * <p>Description:</p>
 * @author hansen.wang
 * @date 2018年4月19日 下午2:44:11
 */
public class MainClassForname {
    
    public static void main(String[] args) throws Exception {
        
        /**
         * 和在MainServiceLoader测试出来的结果一致
         * 没有一次性把全部的扩展点就加载了
         */
        @SuppressWarnings("rawtypes")
        Class clazz = Class.forName("com.jdk.spi.api.impl.three.MutiSpiImpl_3");
        clazz.newInstance();
        System.out.println("over.");
    }
}
