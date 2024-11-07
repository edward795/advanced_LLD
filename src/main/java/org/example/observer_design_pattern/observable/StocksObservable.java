package org.example.observer_design_pattern.observable;

import org.example.observer_design_pattern.observer.NotificationAlertObserver;

public interface StocksObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscribers();

    public void setStockCount(int newStocksAdded);

    public int getStocksCount();
}
