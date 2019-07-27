package com.example;

import com.example.common.BaseDemo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author sh on 2019/6/27 19:46
 * @version ideaIU-2018.2.3.win_home
 */
public class OringinDemo {
    public static void main(String[] args) throws NoSuchMethodException {


        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        // BaseDemo baseDemo = new BaseDemo();
        //BaseDemo baseDemo = (BaseDemo)applicationContext.getBean("baseDemo");


        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(OringinDemo.class);

        BaseDemo baseDemo = (BaseDemo)annotationConfigApplicationContext.getBean("baseDemo");

        System.out.println("");


    }
}
