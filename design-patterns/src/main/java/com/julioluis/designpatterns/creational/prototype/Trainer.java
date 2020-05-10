package com.julioluis.designpatterns.creational.prototype;

public class Trainer implements Prototype {

    private String name;
    private String email;

    public Trainer(Builder builder) {
        this.name=builder.name;
        this.email=builder.email;
    }

    static class Builder {
        private String name;
        private String email;

        public Builder name(String name) {
            this.name=name;
            return this;
        }

        public Builder email(String email) {
            this.email=email;
            return this;
        }

        public Trainer build() {
            return new Trainer(this);
        }


    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }



    @Override
    public String toString() {
        return "Trainer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public Trainer clone() throws CloneNotSupportedException {
        return (Trainer) super.clone();
    }
}
