package iterator;

import java.util.Iterator;

/**
 * Created by например Андрей
 * on 08.10.2017.
 */
public class DinnerMenuIterator implements java.util.Iterator<MenuItem> {
    MenuItem[] items;
    int position = 0;

    public DinnerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return !(position >= items.length || items[position] == null);
    }

    @Override
    public MenuItem next() {
        MenuItem item = items[position];
        position++;
        return item;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You cannot remove an item until you done at least one next()");
        }
        if (items[position-1] != null) {
            for (int i = position - 1; i < (items.length - 1) ; i++) {
                items[i] = items[i+1];
            }
            items[items.length-1] = null;
        }
    }
}
