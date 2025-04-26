package level4;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuItem bugerMenu1 = new MenuItem("ShackBurger", 6.9, "토마토, 양상추  쉑소스가  토핑된 치즈버거");
        MenuItem bugerMenu2 = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem bugerMenu3 = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem bugerMenu4 = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");
        List<MenuItem> burgerItems = new ArrayList();
        burgerItems.add(bugerMenu1);
        burgerItems.add(bugerMenu2);
        burgerItems.add(bugerMenu3);
        burgerItems.add(bugerMenu4);
        List<MenuItem> drinkItems = new ArrayList();
        List<MenuItem> dessertItems = new ArrayList();
        List<Menu> mainMenus = new ArrayList();
        List<Menu> menus = new ArrayList();
        Menu burgers = new Menu("burgers", burgerItems);
        Menu drinks = new Menu("drinks", drinkItems);
        Menu desserts = new Menu("desserts", dessertItems);
        mainMenus.add(burgers);
        mainMenus.add(drinks);
        mainMenus.add(desserts);
        Kiosk kiosk = new Kiosk(menus);
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int menuNumber = 0;
        int pageNumber = 0;
        double totalCost = (double)0.0F;
        List<String> shoppingBasket = new ArrayList();
        List<Integer> amountList = new ArrayList();

        while(flag) {
            switch (pageNumber) {
                case 0:
                    kiosk.mainDisplay(mainMenus);
                    pageNumber = sc.nextInt();
                    if (pageNumber == 0) {
                        flag = false;
                    }
                    break;
                case 1:
                    kiosk.MenuDisplay(sc, burgerItems);
                    menuNumber = kiosk.inputNumber(sc);
                    if (menuNumber == 0) {
                        System.out.println("뒤로 갑니다.");
                        pageNumber = 0;
                    } else {
                        flag = kiosk.printSelectingMenu(menuNumber, burgerItems);
                        if (menuNumber != 0) {
                            kiosk.buyingConfirm(menuNumber, burgerItems);
                            System.out.println("구매할 수량은 선택하세요.");
                            int amount = sc.nextInt();
                            System.out.println("장바구니는 1번 뒤로가기는 0번을 눌러주세요.");
                            int backNumber = sc.nextInt();
                            switch (backNumber) {
                                case 0:
                                    pageNumber = 1;
                                    break;
                                case 1:
                                    shoppingBasket.add(((MenuItem)burgerItems.get(menuNumber)).getMenuName());
                                    amountList.add(amount);
                                    totalCost += ((MenuItem)burgerItems.get(menuNumber)).getPrice() * (double)amount;
                                    System.out.println("구매하기 5번  |  추가구매 0번");
                                    pageNumber = sc.nextInt();
                            }
                        }
                    }
                    break;
                case 5:
                    for(int i = 0; i < shoppingBasket.size(); ++i) {
                        PrintStream var10000 = System.out;
                        Object var10001 = shoppingBasket.get(i);
                        var10000.print((String)var10001 + "    ");
                        var10000 = System.out;
                        var10001 = amountList.get(i);
                        var10000.println("x   " + String.valueOf(var10001));
                    }

                    System.out.println(" W " + Math.round(totalCost));
                    System.out.println("------------------------");
                    flag = false;
                    break;
                case 999:
                    System.out.println("관리자 모드입니다.");
                    System.out.println("1. 메뉴 확인 | 2. 메뉴 변경");
                    int manageNum = sc.nextInt();
                    if (manageNum == 1) {
                        burgers.getMenuName();
                        burgers.getItems();
                    } else if (manageNum == 2) {
                        System.out.println("메뉴 이름 변경");
                        String name = sc.next();
                        burgers.setMenuName(name);
                    }

                    pageNumber = 0;
            }
        }

    }
}
