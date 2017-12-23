package compoundpatterns;

/**
 * Created by например Андрей
 * on 06.11.2017.
 */
public class GooseAdapter implements Quackable {

    private final Observable observable;
    private final Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        this.observable = new Observable(this);
    }

    public void quack() {
        goose.honk();
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
