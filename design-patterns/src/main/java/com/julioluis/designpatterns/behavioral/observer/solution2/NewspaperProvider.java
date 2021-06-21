package com.julioluis.designpatterns.behavioral.observer.solution2;



import java.util.ArrayList;
import java.util.List;

public class NewspaperProvider implements Newspaper {

    private List<Reader> readers=new ArrayList<>();
    private String news;

    @Override
    public void subscribe(Reader reader) {
        readers.add(reader);
    }

    @Override
    public void unSubscribe(Reader reader) {
        int index=readers.indexOf(reader);
        System.out.println("Observer "+ index+1 +" has been deleted");
    }

    @Override
    public void notifyReaders() {
        for(Reader reader : readers) {
            reader.update(news);
        }
    }

    public void setNews(String news) {
        this.news=news;
        notifyReaders();
    }


}
