//package level2;
//
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.List;
//import java.io.PrintStream;
//public class Main {
//
//    public static void main(String[] args) {
//        MenuItem menu1 = new MenuItem("ShackBurger", 6.9, "토마토, 양상추  쉑소스가  토핑된 치즈버거");
//        MenuItem menu2 = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
//        MenuItem menu3 = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
//        MenuItem menu4 = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");
//        List<MenuItem> list = new ArrayList();
//        list.add(menu1);
//        list.add(menu2);
//        list.add(menu3);
//        list.add(menu4);
//        Scanner sc = new Scanner(System.in);
//
//        for(MenuItem number : list) {
//            System.out.println(number.toString());
//        }
//
//        boolean flag = true;
//
//        while(flag) {
//            System.out.println("\n");
//            System.out.println("[ SHAKESHACK MENU ]");
//            PrintStream var10000 = System.out;
//            String var10001 = menu1.getMenuName();
//            var10000.println("1. " + var10001 + "  | W  " + menu1.getPrice() + "  | " + menu1.getDescription());
//            var10000 = System.out;
//            var10001 = menu2.getMenuName();
//            var10000.println("2. " + var10001 + "   | W " + menu2.getPrice() + "  | " + menu2.getDescription());
//            var10000 = System.out;
//            var10001 = menu3.getMenuName();
//            var10000.println("3. " + var10001 + "  | W " + menu3.getPrice() + "  | " + menu3.getDescription());
//            var10000 = System.out;
//            var10001 = menu4.getMenuName();
//            var10000.println("4. " + var10001 + "   | W " + menu4.getPrice() + "  | " + menu4.getDescription());
//            System.out.println("0.  종료   | 종료");
//            System.out.println("메뉴 번호를 입력하세요.");
//            int menuNumber = sc.nextInt();
//            System.out.println("\n");
//            if (menuNumber == 0) {
//                break;
//            }
//
//            System.out.println(((MenuItem)list.get(menuNumber - 1)).getMenuName());
//            var10000 = System.out;
//            Object var18 = list.get(menuNumber - 1);
//            var10000.println("W " + ((MenuItem)var18).getPrice());
//            System.out.println(((MenuItem)list.get(menuNumber - 1)).getDescription());
//        }
//}
