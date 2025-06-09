package org.scoula.ex05;

public class Member {
    String name;
    String engName;

    public Member(String name, String engName) {
        this.name = name;
        this.engName=engName;
    }

    public String getName() {
        return name;
    }

    public String getEngName() {
        return engName;
    }
}
