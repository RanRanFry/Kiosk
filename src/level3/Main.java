//package level3;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        MenuItem menu1 = new MenuItem("ShackBurger", 6.9, "토마토, 양상추  쉑소스가  토핑된 치즈버거");
//        MenuItem menu2 = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
//        MenuItem menu3 = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
//        MenuItem menu4 = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");
//        List<MenuItem> menuitems = new ArrayList();
//        menuitems.add(menu1);
//        menuitems.add(menu2);
//        menuitems.add(menu3);
//        menuitems.add(menu4);
//        Kiosk kiosk = new Kiosk(menuitems);
//        Scanner sc = new Scanner(System.in);
//        boolean flag = true;
//        int menuNumber = 0;
//        System.out.println("키오스크를 사용하시겠습니까?");
//        String input = sc.next();
//        flag = kiosk.powerOn(input);
//
//        while(flag) {
//            kiosk.startMainMenuDisplaay(sc, menuitems);
//            menuNumber = kiosk.inputNumber(sc);
//            flag = kiosk.printSelectingMenu(menuNumber, menuitems, flag);
//            if (menuNumber != 0) {
//                System.out.println("정말 구매하시겠습니까?");
//                System.out.println("구매상품 내역");
//                System.out.println(((MenuItem)menuitems.get(menuNumber - 1)).getMenuName());
//                System.out.println(((MenuItem)menuitems.get(menuNumber - 1)).getPrice());
//                System.out.println("구매 시 1번, 뒤로가기는 0번을 눌러주세요.");
//                int backNumber = sc.nextInt();
//                switch (backNumber) {
//                    case 0:
//                }
//            }
//        }
//
//    }
//}
