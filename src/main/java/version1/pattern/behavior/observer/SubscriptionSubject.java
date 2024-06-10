package version1.pattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 微信公众号：具体被观察者
 */
public class SubscriptionSubject implements Subject {
    // 维护一个观察者集合
    private List<Observer> observerList = new ArrayList<>();
    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyMsg(String message) {
        for (Observer observer : observerList) {
            observer.update(message);
        }
    }
}
