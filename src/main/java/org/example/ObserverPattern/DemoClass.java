package org.example.ObserverPattern;

import org.example.ObserverPattern.Observable.IphoneObservableImpl;
import org.example.ObserverPattern.Observable.StockObservable;
import org.example.ObserverPattern.Observer.EmailAlertObserver;
import org.example.ObserverPattern.Observer.MobileAlertObserver;
import org.example.ObserverPattern.Observer.NotificationAlertObserver;

public class DemoClass {
    public static void main(String[] args) {
        StockObservable iphoneObservable = new IphoneObservableImpl();
        NotificationAlertObserver observer1 = new EmailAlertObserver("test1@gmail.com",iphoneObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("test1@gmail.com",iphoneObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserver("test1",iphoneObservable);

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);

        iphoneObservable.setStockCount(10);
    }

}
