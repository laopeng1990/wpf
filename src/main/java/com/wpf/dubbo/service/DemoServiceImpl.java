package com.wpf.dubbo.service;

/**
 * Created by wenpengfei on 2016/6/30.
 */
public class DemoServiceImpl implements DemoService {

    public void sayHello(String name) {
        System.out.println("name:" + name);
    }
}
