package org.example.ObserverPattern.Observer;

import org.example.ObserverPattern.Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver{

    String userName;
    StockObservable observable;

    public MobileAlertObserver(String userName, StockObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
       sendMsgOnMobile(userName,"product in stock");
    }

    private void sendMsgOnMobile(String userName, String msg){
        System.out.println(userName+" "+msg);
    }
}
