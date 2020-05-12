package com.julioluis.designpatterns.structural.decorator;

public class LunchModel {
    private String description;
    private Double cost;

    public LunchModel(Builder builder) {
        this.description=builder.description;
        this.cost=builder.cost;
    }

    static class Builder {
        private String description;
        private Double cost;

        public Builder description(String description) {
            this.description=description;
            return this;
        }

        public Builder cost(Double cost) {
            this.cost=cost;
            return this;
        }

        public LunchModel build() {
            return new LunchModel(this);
        }


    }

    public String getDescription() {
        return description;
    }

    public Double getCost() {
        return cost;
    }
}
