package com.julioluis.designpatterns.behavioral.observer.solution2;

public class Consumer implements Reader {

    private Newspaper newspaper;
    private String news;
    public  int readerId=0;
    private static int tracker=0;

    public Consumer(Newspaper newspaper) {
        this.newspaper = newspaper;
        this.newspaper.subscribe(this);
       this.readerId=++tracker;
        System.out.println("New Reader has subscribe");
    }

    @Override
    public void update(String news) {
        this.news=news;
        printNews();
    }

    public void printNews() {
        System.out.println(readerId +"\n"+ news);
    }
}
