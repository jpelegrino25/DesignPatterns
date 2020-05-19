package com.julioluis.designpatterns.behavioral.observer;

public class UserReader implements Reader {

    private NewsSubject newsSubject;
    private String name;

    public UserReader(NewsSubject newsSubject,String name) {
        this.newsSubject = newsSubject;
        this.name=name;
        this.newsSubject.attach(this);
    }

    @Override
    public void update(News news) {
        System.out.println(this.getName() +" is reading "
                + "\n" +  news.getTitle()
                + "\n" + news.getContent()+ "\n");
    }

    @Override
    public void unsubscribe() {
        this.newsSubject.dettach(this);
    }

    public String getName() {
        return name;
    }


}
