package compoundpatterns;

/**
 * Created by например Андрей
 * on 06.11.2017.
 */
public class RedHeadDuck implements Quackable {
    private Observable observable;

    public RedHeadDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
