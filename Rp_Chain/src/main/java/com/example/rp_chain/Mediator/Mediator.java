package com.example.rp_chain.Mediator;

public class Mediator implements IMediator{
    private User user;
    private WalletService walletService;
    private StoreService storeService;

    @Override
    public void setUser(User user) {
        this.user = user;
        user.setMediator(this);
    }

    @Override
    public void setWallet(WalletService walletService) {
        this.walletService = walletService;
        walletService.setMediator(this);
    }

    @Override
    public void setStore(StoreService storeService) {
        this.storeService = storeService;
        storeService.setMediator(this);
    }


    @Override
    public void buyProduct(String product) {
        int price = this.storeService.searchProductPrice(product);
        int money = this.walletService.getMoney(this.user.getName());
        if (money >= price) {
            this.walletService.deductMoney(this.user.getName(), price);
        } else {
            System.out.println(user.getName() + " has not enough money to buy " + product);
        }
    }

    @Override
    public void sendNotificationToUser(String message) {
        if(this.user.isMuteMode())
            return;
        this.user.receiveNotification(message);
    }
}
