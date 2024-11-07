package org.example.observer_design_pattern.observer;

import org.example.observer_design_pattern.observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StocksObservable observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable observable){
        this.observable=observable;
        this.emailId=emailId;
    }
    @Override
    public void update() {
        sendMail(emailId,"product is in stock buy now!");
    }
    private void sendMail(String emailId,String msg){
        System.out.println("Mail sent to : "+emailId);
    }
}
