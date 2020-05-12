package com.julioluis.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class SongGroup extends SongComponent {

    private List<SongComponent> songComponents=new ArrayList<>();
    private String name;
    private String description;

    public SongGroup(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void add(SongComponent songComponent) {
        songComponents.add(songComponent);
    }

    @Override
    public void remove(SongComponent songComponent) {
        songComponents.remove(songComponent);
    }

    @Override
    public SongComponent getComponent(int index) {
        return songComponents.get(index);
    }

    @Override
    public void displaySongInfo() {
        System.out.println(getName() +" "+ getDescription());
        for (SongComponent component : songComponents) {
            component.displaySongInfo();
        }
    }
}
