package com.julioluis.designpatterns.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

public class ChatRoomImpl implements ChatRoom {

    private Map<String,User> chatMap=new HashMap<>();

    @Override
    public void sendMessage(String message, String userId) {
        User user=chatMap.get(userId);
        user.receiveMessage(message);
    }

    @Override
    public void addUser(User user) {
        chatMap.put(user.getId(),user);
    }
}
