package com.julioluis.designpatterns.behavioral.mediator;

public interface ChatRoom {
    void sendMessage(String message,String userId);
    void addUser(User user);
}
