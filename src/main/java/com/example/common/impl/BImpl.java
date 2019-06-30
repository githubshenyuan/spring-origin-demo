package com.example.common.impl;

import com.example.common.BaseInterface;

/**
 * @author sh on 2019/6/27 20:25
 * @version ideaIU-2018.2.3.win_home
 */
public abstract class BImpl implements BaseInterface {
    private String bName;
    private String bAge;
    public String a() {
        return null;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbAge() {
        return bAge;
    }

    public void setbAge(String bAge) {
        this.bAge = bAge;
    }
}
