package com.julioluis.designpatterns.behavioral.observer;

public interface Reader {
    void update(News news);
    void unsubscribe();
}
