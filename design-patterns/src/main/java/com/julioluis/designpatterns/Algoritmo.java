package com.julioluis.designpatterns;

import org.springframework.stereotype.Component;

@Component
public class Algoritmo {
    public boolean evenNumber(int num) {
        if(num%2==0)
            return true;
        return false;
    }
}
