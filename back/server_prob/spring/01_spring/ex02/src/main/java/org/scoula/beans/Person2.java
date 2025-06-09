package org.scoula.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person2 {

    private String name="Ella";

    @Autowired
    private Parrot2 parrot2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot2 getParrot2() {
        return parrot2;
    }

    public void setParrot2(Parrot2 p2) {
        parrot2 = p2;
    }
}
