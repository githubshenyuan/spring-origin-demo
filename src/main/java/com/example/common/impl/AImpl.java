package com.example.common.impl;

import com.example.common.BaseAInterface;
import com.example.common.BaseInterface;

/**
 * @author sh on 2019/6/27 20:25
 * @version ideaIU-2018.2.3.win_home
 */
public abstract class AImpl implements BaseInterface, BaseAInterface {

    private String aName;
    private String aAge;



    public String a() {
        return null;
    }

    public String b() {
        return null;
    }

    public String c() {
        return null;
    }

    public String d() {
        return null;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaAge() {
        return aAge;
    }

    public void setaAge(String aAge) {
        this.aAge = aAge;
    }
}
