package Observer;

import Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver {
    public String email;
    public StockObservable stockObservable;

    public EmailAlertObserver(String email, StockObservable stockObservable) {
        this.stockObservable = stockObservable;
        this.email = email;
    }

    @Override
    public void update() {
        sendMail(email, "Product is in stock hurry up!!!");
    }

    public void sendMail(String email, String message) {
        System.out.println("mail sent to: " + email);
    }
}
