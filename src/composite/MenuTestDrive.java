package composite;

/**
 * Created by например Андрей
 * on 08.10.2017.
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinnerMenu = new Menu("DINNER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("name1", "desc1", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("name2", "desc2", false, 3.99));
        pancakeHouseMenu.add(new MenuItem("name3", "desc3", true, 4.99));

        dinnerMenu.add(new MenuItem("name1", "desc1", true, 2.88));
        dinnerMenu.add(new MenuItem("name2", "desc2", true, 3.88));
        dinnerMenu.add(new MenuItem("name3", "desc3", true, 4.88));

        dinnerMenu.add(dessertMenu);

        cafeMenu.add(new MenuItem("name1", "desc1", true, 4.55));
        cafeMenu.add(new MenuItem("name2", "desc2", false, 3.55));
        cafeMenu.add(new MenuItem("name3", "desc3", false, 2.55));

        dessertMenu.add(new MenuItem("Apple Pie",
                "Apple pie with flakey crust, topped with vanilla icecream", true, 1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }

}
