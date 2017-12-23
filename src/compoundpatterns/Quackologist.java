package compoundpatterns;

/**
 * Created by например Андрей
 * on 06.11.2017.
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
