package org.example.observer_design_pattern.observable;

import org.example.observer_design_pattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObserverImpl implements StocksObservable{

    public List<NotificationAlertObserver> observerList=new ArrayList<>();
    public int stockCount=0;
    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer:observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStocksAdded) {
        if(stockCount==0){
            notifySubscribers();
        }
        stockCount+=newStocksAdded;
    }

    @Override
    public int getStocksCount() {
      return stockCount;
    }
}
