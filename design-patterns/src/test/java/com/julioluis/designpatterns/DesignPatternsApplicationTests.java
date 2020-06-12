package com.julioluis.designpatterns;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;

@SpringBootTest
class DesignPatternsApplicationTests {

    @Autowired
    private Algoritmo algoritmo;

    @Test
    public void testEvenNumber() {
        boolean result=algoritmo.evenNumber(26);

        assertEquals(true,result);

    }

}
