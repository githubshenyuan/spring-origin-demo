package com.example;

import com.example.common.BaseDemo;
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

        BaseDemo baseDemo1 = new BaseDemo();

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        BaseDemo baseDemo = (BaseDemo)applicationContext.getBean("baseDemo");
        System.out.println("");
        Constructor<OringinDemo> declaredConstructor = OringinDemo.class.getDeclaredConstructor();

        //System.out.println(a);


    }
}
