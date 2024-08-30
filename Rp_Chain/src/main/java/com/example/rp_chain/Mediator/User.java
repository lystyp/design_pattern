package com.example.rp_chain.Mediator;

import lombok.Data;

@Data
public class User extends Colleague {
    private String name;

    public User(String name) {
        this.name = name;
    }

    // public for client
    public void buyProduct(String product) {
        this.mediator.buyProduct(product);
    }

    // public for mediator
    public void receiveNotification(String message) {
        System.out.println("[" + this.name + " Received message] : " + message);
    }

    public boolean isMuteMode() {
        return true;
    }

}
