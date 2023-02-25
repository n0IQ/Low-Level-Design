package Observable;

import Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable {
    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public  int stockCount;

    @Override
    public void register(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void unregister(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStocks) {
        if(stockCount == 0) {
            notifySubscribers();
        }
        stockCount += newStocks;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}