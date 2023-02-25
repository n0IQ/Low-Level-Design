import Observable.IphoneObservable;
import Observable.StockObservable;
import Observer.EmailAlertObserver;
import Observer.MobileAlertObserver;
import Observer.NotificationAlertObserver;

import java.util.Stack;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservable();

        NotificationAlertObserver observer1 = new EmailAlertObserver("mohit122@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("n0iq@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserver("n0IQ", iphoneStockObservable);

        iphoneStockObservable.register(observer1);
        iphoneStockObservable.register(observer2);
        iphoneStockObservable.register(observer3);

        iphoneStockObservable.setStockCount(10);
        System.out.println("Stock Count is: " + iphoneStockObservable.getStockCount());
    }
}