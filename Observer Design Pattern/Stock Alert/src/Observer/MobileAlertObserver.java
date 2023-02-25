package Observer;

import Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver {
    String userName;
    public StockObservable stockObservable;

    public MobileAlertObserver(String userName, StockObservable stockObservable) {
        this.stockObservable = stockObservable;
        this.userName = userName;
    }

    @Override
    public void update() {
        sendMessage(userName, "Product is in stock hurry up!!!");
    }

    public void sendMessage(String userName, String message) {
        System.out.println("message sent to: " + userName);
        // find mobile number from username in DB
    }
}
