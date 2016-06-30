package com.wpf.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by wenpengfei on 2016/6/30.
 */
public class Provider {

    public static void main(String[] args) throws Exception {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(
                System.getProperty("user.dir") + "/config/dubbo_provider.xml");
        context.start();

        System.in.read();
    }
}
