package level3;

import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    List<MenuItem> menuitems;

    public Kiosk(List<MenuItem> menuitems) {
        this.menuitems = menuitems;
    }

    public void startMainMenuDisplaay(Scanner sc, List<MenuItem> menuitems) {
        System.out.println("\n");
        System.out.println("[ SHAKESHACK MENU ]");

        for(int i = 0; i < menuitems.size(); ++i) {
            System.out.println(i + 1 + " " + ((MenuItem)menuitems.get(i)).getMenuName() + " " + ((MenuItem)menuitems.get(i)).getPrice() + " " + ((MenuItem)menuitems.get(i)).getDescription());
        }

        System.out.println("0.  종료   | 뒤로가기");
    }

    public int inputNumber(Scanner sc) {
        System.out.println("메뉴 번호를 입력하세요.");
        int menuNumber = sc.nextInt();
        System.out.println("\n");
        return menuNumber;
    }

    public boolean printSelectingMenu(int menuNumber, List<MenuItem> menuitems, boolean flag) {
        if (menuNumber == 0) {
            flag = false;
            return flag;
        } else {
            System.out.println(((MenuItem)menuitems.get(menuNumber - 1)).getMenuName());
            PrintStream var10000 = System.out;
            Object var10001 = menuitems.get(menuNumber - 1);
            var10000.println("W " + ((MenuItem)var10001).getPrice());
            System.out.println(((MenuItem)menuitems.get(menuNumber - 1)).getDescription());
            return flag;
        }
    }

    public boolean powerOn(String input) {
        if (!input.equals("no")) {
            System.out.println("키오스크를 시작합니다.");
            return true;
        } else {
            System.out.println("사용을 중지합니다.");
            return false;
        }
    }
}
