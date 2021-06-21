package com.julioluis.designpatterns.integration;

import com.julioluis.designpatterns.Algoritmo;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest

class DesignPatternsApplication {

    @Autowired
    private Algoritmo algoritmo;

    @Test
    public void testEvenNumber() {
        boolean result=algoritmo.evenNumber(26);

        assertEquals(true,result);

    }

}
