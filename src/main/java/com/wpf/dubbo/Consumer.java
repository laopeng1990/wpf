package com.wpf.dubbo;

import com.wpf.dubbo.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by wenpengfei on 2016/6/30.
 */
public class Consumer {

    public static void main(String[] args) throws Exception {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("config/dubbo_consumer.xml");
        context.start();

        DemoService demoService = (DemoService)context.getBean("demoService");
        for (int i = 0; i < 5; ++i) {
            demoService.sayHello(String.valueOf(i));
        }
    }
}
