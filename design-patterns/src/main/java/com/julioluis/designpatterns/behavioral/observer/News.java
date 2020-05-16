package com.julioluis.designpatterns.behavioral.observer;

public class News {
    private String title;
    private String content;

    public News(Builder builder) {
        this.title=builder.title;
        this.content=builder.content;
    }

    static class Builder {
        private String title;
        private String content;

        public Builder title(String title) {
            this.title=title;
            return this;
        }

        public Builder content(String content) {
            this.content=content;
            return this;
        }

        public News build() {
            return new News(this);
        }

    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
