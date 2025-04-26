package level1;
import java.util.Scanner;
import java.io.PrintStream;
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu1 = new Menu("ShackBurger", 6.9, "토마토, 양상추  쉑소스가  토핑된 치즈버거");
        Menu menu2 = new Menu("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        Menu menu3 = new Menu("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        Menu menu4 = new Menu("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");
        boolean flag = true;

        while(flag) {
            System.out.println("[ SHAKESHACK MENU ]");
            PrintStream var10000 = System.out;
            String var10001 = menu1.getMenuName();
            var10000.println("1. " + var10001 + "  | W  " + menu1.getPrice() + "  | " + menu1.getDescription());
            var10000 = System.out;
            var10001 = menu2.getMenuName();
            var10000.println("2. " + var10001 + "   | W " + menu2.getPrice() + "  | " + menu2.getDescription());
            var10000 = System.out;
            var10001 = menu3.getMenuName();
            var10000.println("3. " + var10001 + "  | W " + menu3.getPrice() + "  | " + menu3.getDescription());
            var10000 = System.out;
            var10001 = menu4.getMenuName();
            var10000.println("4. " + var10001 + "   | W " + menu4.getPrice() + "  | " + menu4.getDescription());
            System.out.println("0.  종료   | 종료");
            System.out.println("메뉴 번호를 입력하세요.");
            int menuNumber = sc.nextInt();
            switch (menuNumber) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    System.out.println(menu1.getMenuName() + "\n");
                    System.out.println(menu1.getDescription());
                    System.out.println("W " + menu1.getPrice());
                    System.out.println("1. 구매 | 2. 장바구니 | 3. 뒤로가기");
            }
        }

    }
}
