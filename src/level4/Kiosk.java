package level4;

import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    List<Menu> mainMenu;
    List<Menu> menus;
    List<String> shoppingBasket;

    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    public List<String> getShoppingBasket() {
        return this.shoppingBasket;
    }

    public void mainDisplay(List<Menu> mainMenus) {
        System.out.println(" [ MAIN MENU ]");
        System.out.println("전체 사이즈는 " + mainMenus.size() + "입니다.");

        for(int i = 0; i < mainMenus.size(); ++i) {
            System.out.println(i + 1 + "  " + ((Menu)mainMenus.get(i)).getMenuName());
        }

        System.out.println("0.  종료   | 종료");
    }

    public void MenuDisplay(Scanner sc, List<MenuItem> items) {
        System.out.println("\n");
        System.out.println("--------------------------------------------");
        System.out.println("[ SHAKESHACK MENU ]");

        for(int i = 0; i < items.size(); ++i) {
            System.out.println(i + 1 + " " + ((MenuItem)items.get(i)).getMenuName() + " " + ((MenuItem)items.get(i)).getPrice() + " " + ((MenuItem)items.get(i)).getDescription());
        }

        System.out.println("0.  종료   | 종료");
        System.out.println("--------------------------------------------");
    }

    public void buyingConfirm(int menuNumber, List<MenuItem> items) {
        System.out.println("정말 구매하시겠습니까?");
        System.out.println("구매상품 내역");
        System.out.println(((MenuItem)items.get(menuNumber - 1)).getMenuName());
        System.out.println(((MenuItem)items.get(menuNumber - 1)).getPrice());
    }

    public void buyingDisplay(double cost, List list) {
        System.out.println("------------------------");

        for(int i = 0; i < this.shoppingBasket.size(); ++i) {
            PrintStream var10000 = System.out;
            Object var10001 = this.shoppingBasket.get(i);
            var10000.print((String)var10001 + "    ");
            var10000 = System.out;
            var10001 = list.get(i);
            var10000.println("x   " + String.valueOf(var10001));
        }

        System.out.println(" W " + Math.round(cost));
        System.out.println("------------------------");
    }

    public int inputNumber(Scanner sc) {
        System.out.println("--------------------------------------------");
        System.out.println("메뉴 번호를 입력하세요.");
        int menuNumber = sc.nextInt();
        System.out.println("--------------------------------------------");
        System.out.println("\n");
        return menuNumber;
    }

    public boolean printSelectingMenu(int menuNumber, List<MenuItem> burgerItems) {
        if (menuNumber == 0) {
            return false;
        } else {
            System.out.println(burgerItems.get(menuNumber - 1));
            System.out.println("--------------------------------------------");
            System.out.println(((MenuItem)burgerItems.get(menuNumber - 1)).getMenuName());
            PrintStream var10000 = System.out;
            Object var10001 = burgerItems.get(menuNumber - 1);
            var10000.println("W " + ((MenuItem)var10001).getPrice());
            System.out.println(((MenuItem)burgerItems.get(menuNumber - 1)).getDescription());
            System.out.println("--------------------------------------------");
            return true;
        }
    }
}
