package com.julioluis.designpatterns.creational.builder.solution2;

public class Item {

    private Integer id;
    private String description;

    public Item(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public Item() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
