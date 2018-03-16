package com.codecool.web.model;

public final class Subscription {

    private String text;
    private String email;
    private String name;


    public Subscription(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Subscription(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
