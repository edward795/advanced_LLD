package org.example.observer_design_pattern;

import org.example.observer_design_pattern.observable.IphoneObserverImpl;
import org.example.observer_design_pattern.observable.StocksObservable;
import org.example.observer_design_pattern.observer.EmailAlertObserverImpl;
import org.example.observer_design_pattern.observer.MobileAlertObserverImpl;
import org.example.observer_design_pattern.observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneStocksObservable = new IphoneObserverImpl();
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz@gmail.com",
                iphoneStocksObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("abc@gmail.com",
                iphoneStocksObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("abc@gmail.com",
                iphoneStocksObservable);
        iphoneStocksObservable.add(observer1);
        iphoneStocksObservable.add(observer2);
        iphoneStocksObservable.add(observer3);

        iphoneStocksObservable.setStockCount(3);
    }
}
