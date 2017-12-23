package compoundpatterns;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by например Андрей
 * on 06.11.2017.
 */
public class Observable implements QuackObservable {
    private List<Observer> observers = new ArrayList<Observer>();
    private QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(duck);
        }
    }
}
