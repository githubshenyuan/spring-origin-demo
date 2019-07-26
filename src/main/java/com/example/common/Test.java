package com.example.common;

import com.example.entity.User;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Test {
    private static final ThreadLocal<String> threadLocal = new ThreadLocal<String>();
    private static final ThreadLocal<String> threadLocal2 = new ThreadLocal<String>();

    public static void main(String[] args) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor constructor = Test.class.getDeclaredConstructor();

        Object o = constructor.newInstance();
        System.out.println();

    }

    public static String get() {

        return (String) new Object();
    }

}
