package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sh on 2019/6/27 19:46
 * @version ideaIU-2018.2.3.win_home
 */
public class OringinDemo {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
    }
}
