package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String userName;
    StockObservable stockObservable;

    public MobileAlertObserverImpl(String emailId,StockObservable stockObservable){
        this.userName=emailId;
        this.stockObservable=stockObservable;
    }


    @Override
    public void update() {
        sendMsgOnMobile(userName,"Product is in stock hurry up!!!");
    }

    public void sendMsgOnMobile(String userName,String msg){
        System.out.println("msg sent to : "+userName);
    }
}
