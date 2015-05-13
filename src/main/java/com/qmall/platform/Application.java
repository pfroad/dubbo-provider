package com.qmall.platform;

import com.qmall.platform.dao.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by caoyi on 5/13/15.
 */
public class Application {

//    static {
//        Runtime.getRuntime().addShutdownHook(new Thread() {
//            @Override
//            public void run() {
//applicationContext.xml
//            }
//        });
//    }

    public static void main(String[] args) throws Exception {
        try {
            // init sprint context
            SpringContext.init();
            UserDao user = (UserDao) SpringContext.getContext().getBean("userDao");
            // run provider
           //ClassPathXmlApplicationContext customer = new ClassPathXmlApplicationContext(new String[]{"classpath*:/providers*//***/*//*.xml"});
//            customer.start();
//            customer.registerShutdownHook();   // register shutdown hook
        } catch (Exception e) {

        }


        System.out.println("Press any key to stop it");
        System.in.read();
    }
}
