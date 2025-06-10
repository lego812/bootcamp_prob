package org.scoula;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.scoula.config.RootConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = RootConfig.class)
class RestaurentTest {

    @Autowired
    private Restaurent restaurant;

    @Test
    void getChef() {
        log.info(restaurant);
        log.info(restaurant.getChef());
        assertNotNull(restaurant.getChef());
    }
}