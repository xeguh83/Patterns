package iterator;

import java.util.*;

/**
 * Created by например Андрей
 * on 08.10.2017.
 */
public class PancakeHouseMenu implements Menu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("name1", "desc1", true, 2.99);
        addItem("name2", "desc2", false, 3.99);
        addItem("name3", "desc3", true, 4.99);
    }

    private void addItem(String name, String desc, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, desc, vegetarian, price);
        menuItems.add(menuItem);
    }

    public java.util.Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
