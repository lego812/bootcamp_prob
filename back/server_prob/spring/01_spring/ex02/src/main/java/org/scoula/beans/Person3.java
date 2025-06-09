package org.scoula.beans;

import org.springframework.stereotype.Component;

@Component
public class Person3 {
    private String name="Ella";
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

    public void setParrot2(Parrot2 parrot2) {
        this.parrot2 = parrot2;
    }

    public Person3(Parrot2 parrot2) {
        this.parrot2 = parrot2;
    }
}
