package com.julioluis.designpatterns.behavioral.memento;

public class Demo {

    public static void main(String[] args) {

        Article article=new Article("DR President election","on July 5th we election even we have the pandemic");

        ArticleMemento memento=article.getArticleMemento();

        article.setTitle("Title 1");
        article.setContent("Content 1");

        System.out.println(article);

        article.restore(memento);

        System.out.println(article);


    }
}
