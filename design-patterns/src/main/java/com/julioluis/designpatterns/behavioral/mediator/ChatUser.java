package com.julioluis.designpatterns.behavioral.mediator;

public class ChatUser extends User {

    public ChatUser(ChatRoom chatRoom, String id, String name) {
        super(chatRoom, id, name);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(this.getName() + " :: Receiving : "+ message);

    }

    @Override
    public void send(String message, String userId) {
        System.out.println(this.getName() + " Sending : "+ message);
        this.getChatRoom().sendMessage(message,userId);
    }
}
