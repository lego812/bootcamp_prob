package org.scoula.config;

import org.scoula.domain.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot(){
        Parrot parrot = new Parrot();
        parrot.setName("Koko");
        return parrot;
    }
}
