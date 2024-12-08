package org.example.ObserverPattern.Observable;

import org.example.ObserverPattern.Observer.NotificationAlertObserver;

public interface StockObservable {
    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifySubscribers();
    void setStockCount(int newStockAdded);
    int getStockCount();
}
