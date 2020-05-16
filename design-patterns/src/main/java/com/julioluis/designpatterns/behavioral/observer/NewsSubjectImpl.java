package com.julioluis.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsSubjectImpl implements NewsSubject {

    private List<Reader> readers=new ArrayList<>();

    @Override
    public void attach(Reader reader) {
        readers.add(reader);
    }

    @Override
    public void dettach(Reader reader) {
        readers.remove(reader);
    }

    @Override
    public void notify(News news) {
        for (Reader reader : readers) {
            reader.update(news);
        }
    }
}
