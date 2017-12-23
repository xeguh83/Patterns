package iterator;

/**
 * Created by например Андрей
 * on 08.10.2017.
 */
public class DinnerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("name1", "desc1", true, 2.88);
        addItem("name2", "desc2", true, 3.88);
        addItem("name3", "desc3", true, 4.88);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry menu is full");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public java.util.Iterator<MenuItem> createIterator() {
        return new DinnerMenuIterator(menuItems);
    }
    
}
