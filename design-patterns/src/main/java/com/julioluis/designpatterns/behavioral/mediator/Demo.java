package com.julioluis.designpatterns.behavioral.mediator;

public class Demo {

    public static void main(String[] args) {

        ChatRoom chatRoom=new ChatRoomImpl();

        User user1=new ChatUser(chatRoom,"1","Juan");
        User user2=new ChatUser(chatRoom,"2","Pedro");
        User user3=new ChatUser(chatRoom,"3","Carlos");
        User user4=new ChatUser(chatRoom,"4","Maria");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);
        chatRoom.addUser(user4);

        user1.send("Hello Carlos","3");
        user3.send("Hey Juan, what are you doing?","1");
    }
}
