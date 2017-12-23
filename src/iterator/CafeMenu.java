package iterator;

import java.util.*;
import java.util.Iterator;

/**
 * Created by например Андрей
 * on 08.10.2017.
 */
public class CafeMenu implements Menu {

    Map<String, MenuItem> items = new HashMap<>();

    public CafeMenu() {
        addItem("name1", "desc1", true, 4.55);
        addItem("name2", "desc2", false, 3.55);
        addItem("name3", "desc3", false, 2.55);
    }

    private void addItem(String name, String desc, boolean veg, double price) {
        MenuItem menuItem = new MenuItem(name, desc, veg, price);
        items.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return items.values().iterator();
    }
}
