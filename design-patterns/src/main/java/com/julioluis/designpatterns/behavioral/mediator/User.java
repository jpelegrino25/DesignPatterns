package com.julioluis.designpatterns.behavioral.mediator;

public abstract class User {
    private ChatRoom chatRoom;
    private String id;
    private String name;

    public User(ChatRoom chatRoom, String id, String name) {
        this.chatRoom = chatRoom;
        this.id = id;
        this.name = name;
    }

    public abstract void receiveMessage(String message);
    public abstract void send(String message,String userId);

    public ChatRoom getChatRoom() {
        return chatRoom;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
