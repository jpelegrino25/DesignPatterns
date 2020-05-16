package com.julioluis.designpatterns.behavioral.memento;

public class Article {

    private String title;
    private String content;

    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public ArticleMemento getArticleMemento() {
        ArticleMemento memento=new ArticleMemento(title,content);
        return memento;
    }

    public void restore(ArticleMemento memento) {
        this.title=memento.getTitle();
        this.content=memento.getContent();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
