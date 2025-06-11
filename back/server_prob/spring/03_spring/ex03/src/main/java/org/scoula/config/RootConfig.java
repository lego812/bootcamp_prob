package org.scoula.config;

import org.scoula.ex03.controller.SampleController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"org.scoula","org.scoula.ex03.controller"})
public class RootConfig {
}
