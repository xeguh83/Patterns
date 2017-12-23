package iterator;

/**
 * Created by например Андрей
 * on 08.10.2017.
 */
public class Waitress {
    Menu menu1;
    Menu menu2;
    Menu menu3;

    public Waitress(Menu menu1, Menu menu2, Menu menu3) {
        this.menu1 = menu1;
        this.menu2 = menu2;
        this.menu3 = menu3;
    }

    public void printMenu() {
        java.util.Iterator<MenuItem> iterator1 = menu1.createIterator();
        java.util.Iterator<MenuItem> iterator2 = menu2.createIterator();
        java.util.Iterator<MenuItem> iterator3 = menu3.createIterator();

        System.out.println("Menu \n Breakfast");
        printMenu(iterator1);

        System.out.println("\n Lunch");
        printMenu(iterator2);

        System.out.println("\n Dinner");
        printMenu(iterator3);
    }

    private void printMenu(java.util.Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            System.out.print(item.getName() + ", ");
            System.out.print(item.getPrice() + ", ");
            System.out.println(item.getDescription());
        }
    }
}
