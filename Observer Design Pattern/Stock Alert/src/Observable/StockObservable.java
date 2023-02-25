package Observable;

import Observer.NotificationAlertObserver;

public interface StockObservable {
    public void register(NotificationAlertObserver observer);
    public void unregister(NotificationAlertObserver observer);
    public void notifySubscribers();
    public void setStockCount(int newStocks);
    public int getStockCount();
}
