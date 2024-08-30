package com.example.rp_chain.Mediator;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MediatorApplication {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        WalletService walletService = new WalletService();
        StoreService storeService = new StoreService();
        User peter = new User("Peter");

        mediator.setWallet(walletService);
        mediator.setStore(storeService);
        mediator.setUser(peter);

        peter.buyProduct("apple");
        System.out.println("\n------------------------------------\n");


        User danny = new User("Danny");
        mediator.setUser(danny);
        danny.buyProduct("banana");

    }

}
