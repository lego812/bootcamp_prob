package org.scoula;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Restaurent {

    //@Autowired
    private Chef chef;

    //생성자
    public Restaurent(){
        this.chef=new Chef();
    }

    //set
}
