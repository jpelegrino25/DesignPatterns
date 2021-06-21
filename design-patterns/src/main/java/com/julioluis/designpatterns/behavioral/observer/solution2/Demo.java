package com.julioluis.designpatterns.behavioral.observer.solution2;

public class Demo {

    public static void main(String[] args) {
        NewspaperProvider provider=new NewspaperProvider();

        Consumer juan=new Consumer(provider);

        Consumer pedro=new Consumer(provider);

        provider.setNews("PLD se desliga de denuncias de sus dirigentes");

    }
}
