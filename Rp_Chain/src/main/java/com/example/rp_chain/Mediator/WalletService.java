package com.example.rp_chain.Mediator;

import java.util.HashMap;
import java.util.Map;

public class WalletService extends Colleague{
    HashMap<String, Integer> moneyMap = new HashMap<>(
            Map.of(
                    "Peter", 1000,
                    "Danny", 10
            )
    );

    // public for mediator
    public int getMoney(String user) {
        System.out.println("Get " + user + "'s money = " + this.moneyMap.get(user));
        return this.moneyMap.get(user);
    }

    // public for mediator
    public void deductMoney(String user, int amount) {
        System.out.println("Deducted " + amount + " from " + user + "'s wallet");
        this.moneyMap.put(user, this.moneyMap.get(user) - amount);
        this.mediator.sendNotificationToUser(
                "Deducted " + amount + " from " + user + "'s wallet," +
                " remaining: " + this.moneyMap.get(user));
    }

}
