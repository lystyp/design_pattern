package com.example.rp_chain.Mediator;

public interface IMediator {
    // Setting
    void setUser(User user);
    void setWallet(WalletService walletService);
    void setStore(StoreService storeService);

    // public for user
    void buyProduct(String product);


    // public for wallet
    void sendNotificationToUser(String message);
}
