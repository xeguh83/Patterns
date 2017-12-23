package compoundpatterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by например Андрей
 * on 06.11.2017.
 */
public class Flock implements Quackable {
    private List<Quackable> quackers = new ArrayList<Quackable>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for (Quackable quacker : quackers) {
            quacker.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Quackable quacker : quackers) {
            quacker.notifyObservers();
        }
    }
}
