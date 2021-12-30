/*
package com.company.view;


import com.company.Controller.Menu.*;

import java.sql.SQLException;

public class UserMenu {
    private InputScanner scanner;
    private static UserMenu instance = null;

    private UserMenu() {
        scanner = InputScanner.getInstance();
    }

    public static UserMenu getInstance() {
        if (instance == null) {
            instance = new UserMenu();
        }
        return instance;
    }

    public void startUserMenu() throws SQLException, ClassNotFoundException {
        printMainMenu();
        chooseMainMenuItem();
    }

    private void printMainMenu() {
        System.out.println("\n1: Переглянути список фургонів на складі");
        System.out.println("2: Створити новий фургон");
        System.out.println("3: Видалити фургон");
        System.out.println("4: Переглянути каву на складі");
        System.out.println("5: Купити каву на склад");
        System.out.println("6: Видалити каву зі складу");
        System.out.println("7: Перенести каву зі складу в фургон");
        System.out.println("8: Перенести каву з фургону на склад");
        System.out.println("9: Переглянути каву в фургоні");
        System.out.println("10: Посортувати каву в фургоні");
        System.out.println("11: Знайти каву певних сортів у фургоні");
        System.out.println("12: Вихід\n");
    }

    private void chooseMainMenuItem() throws SQLException, ClassNotFoundException {
        int menuItem;
        while(true) {
            System.out.print("Виберіть команду з меню: ");
            menuItem = scanner.getNumber();
            System.out.println();
            switch (menuItem) {
                case 1:
                    makeMenuAction(new VanInStorage());
                    startUserMenu();
                    break;
                case 2:
                    makeMenuAction(new NewVan());
                    startUserMenu();
                    break;
                case 3:
                    makeMenuAction(new DeleteVan());
                    startUserMenu();
                    break;
                case 4:
                    makeMenuAction(new CheckCoffeeInStorage());
                    startUserMenu();
                    break;
                case 5:
                    makeMenuAction(new AddCoffee());
                    startUserMenu();
                    break;
                case 6:
                    makeMenuAction(new DeleteCoffeeInStorage());
                    startUserMenu();
                    break;
                case 7:
                    makeMenuAction(new StorageToVan());
                    startUserMenu();
                    break;
                case 8:
                    makeMenuAction(new VanToStorage());
                    startUserMenu();
                    break;
                case 9:
                    makeMenuAction(new CheckCoffeeInVan());
                    startUserMenu();
                    break;
                case 10:
                    makeMenuAction(new SortCoffeeInVan());
                    startUserMenu();
                    break;
                case 11:
                    makeMenuAction(new FindCoffeeInVan());
                    startUserMenu();
                    break;
                case 12:
                    makeMenuAction(new ExitProgramm());
                    break;
                default:
                    System.out.println("Невірно введена команда!");
            }
        }
    }

    private void makeMenuAction(MenuItem menuItem) throws SQLException, ClassNotFoundException {
        menuItem.execute();
    }
}

*/
