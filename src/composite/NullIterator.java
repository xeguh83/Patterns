package composite;

import java.util.Iterator;

/**
 * Created by например Андрей
 * on 08.10.2017.
 */
public class NullIterator implements Iterator<MenuComponent> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }
}
