package Kiosk2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(" [ SHAKESHACK MENU ]");
            for (int i = 0; i < 4; i++) {
                String burger = sc.next();
                double price = sc.nextDouble();
                String description = sc.nextLine();
                System.out.println((i + 1) + ".  " + burger + " |  W " + price + " |   " + description);
            }
            System.out.println("0. 종료    |   종료");
            System.out.println("메뉴를 선택하세요.");
            int menuNumber = sc.nextInt();
            if (menuNumber == 0) {
                break;
            }
        }


    }


}
