package com.example.rp_chain.Mediator;

import java.util.Map;

public class StoreService extends Colleague {
    Map<String, Integer> products = Map.of(
            "apple", 100,
            "banana", 200,
            "cherry", 300
    );

    // public for mediator
    int searchProductPrice(String product) {
        System.out.println("Searching for " + product + ", price = " + products.get(product));
        return products.get(product);
    }

}
