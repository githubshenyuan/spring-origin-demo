package com.example.controller;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


/**
 * @author sh on 2018/11/24 22:44
 * @version ideaIU-2018.2.3.win_home
 */
public class DemoControllerTest {

    @Test
    public void demo() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
        applicationContext.getBean("demoController");
    }
}