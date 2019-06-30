package com.example.common;

import com.example.common.impl.AImpl;

/**
 * @author sh on 2019/6/27 19:47
 * @version ideaIU-2018.2.3.win_home
 */
public class BaseDemo extends AImpl {

    public BaseDemo() {
    }

    public BaseDemo(String name) {
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String e() {
        return null;
    }

}
