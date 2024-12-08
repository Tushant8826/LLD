package org.example.ObserverPattern.Observer;

import org.example.ObserverPattern.Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver {

    String email;
    StockObservable observable;

    public EmailAlertObserver(String email, StockObservable observable) {
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
       sendEmail(email,"send notification via email");
    }

     void sendEmail(String email, String msg) {
        System.out.println(email+" "+msg);
    }

}
