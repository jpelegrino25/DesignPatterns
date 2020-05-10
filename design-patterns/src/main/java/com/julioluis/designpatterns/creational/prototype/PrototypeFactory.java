package com.julioluis.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory<T> {

    private static Map<ModelType, Prototype> capableMap= new HashMap<>();

    static {
        capableMap.put(ModelType.TRAINER,new Trainer.Builder().name("Peter").email("peter@gmail.com").build());
        capableMap.put(ModelType.TRAINING,new Training());
    }

    public static Prototype getInstance(ModelType modelType) throws CloneNotSupportedException {
        return ((Prototype) capableMap.get(modelType)).clone();
    }
}
