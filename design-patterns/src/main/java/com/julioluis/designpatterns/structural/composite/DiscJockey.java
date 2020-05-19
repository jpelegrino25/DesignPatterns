package com.julioluis.designpatterns.structural.composite;

public class DiscJockey {
    private SongComponent songComponent;

    public DiscJockey(SongComponent songComponent) {
        this.songComponent = songComponent;
    }

    public void displaySongList() {
        songComponent.displaySongInfo();
    }
}
