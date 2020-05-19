package com.julioluis.designpatterns.behavioral.observer;

public class Demo {

    public static void main(String[] args) {

        NewsSubject subject=new NewsSubjectImpl();

        Reader reader1=new UserReader(subject,"Josef");
        Reader reader2=new UserReader(subject,"Jennifer");
        Reader reader3=new UserReader(subject,"Lorena");

        News news=new News.Builder()
                .title("Presidente Medina responderá a presiones")
                .content("El presidente Danilo Medina hablará al pueblo dominicano mañana domingo a las 8:00 de la noche")
                .build();

        reader2.unsubscribe();

        subject.notify(news);
    }
}
