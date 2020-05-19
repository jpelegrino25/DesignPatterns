package com.julioluis.designpatterns.behavioral.observer;

public interface NewsSubject {
    void attach(Reader reader);
    void dettach(Reader reader);
    void notify(News news);
}
