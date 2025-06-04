package org.scoula.ex05.domain;

import jdk.jfr.DataAmount;


public class Member {
    private String name;
    private String userid;

    public Member() {}

    public Member(String name, String userid) {
        this.name = name;
        this.userid = userid;
    }

    public String getName() {
        return name;
    }
    public String getUserid() {
        return userid;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
