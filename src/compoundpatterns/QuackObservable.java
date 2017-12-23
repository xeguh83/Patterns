package compoundpatterns;

/**
 * Created by например Андрей
 * on 06.11.2017.
 */
public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
