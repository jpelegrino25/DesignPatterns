package com.julioluis.designpatterns.behavioral.observer.solution2;

public interface Newspaper {
    void subscribe(Reader reader);
    void unSubscribe(Reader reader);
    void notifyReaders();
}
