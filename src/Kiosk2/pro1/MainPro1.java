package Kiosk2.pro1;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainPro1 {

    public static void main(String[] args) {
        List<KioskPro2> menuBox = new ArrayList<>(); //메뉴들을 담기 위한 리스트
        menuBox.addAll(Arrays.asList(
                new KioskPro2("종료    |    종료"),
                new KioskPro2("Burgers"),
                new KioskPro2("Drinks"),
                new KioskPro2("Desserts")
        ));

        List<MenuItemPro1> burgerBox = new ArrayList<>(); //버거 메뉴를 담기 위한 리스트
        burgerBox.addAll(Arrays.asList(
                new MenuItemPro1("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                new MenuItemPro1("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
                new MenuItemPro1("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
                new MenuItemPro1("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")
        ));
        List<MenuItemPro1> drinkBox = new ArrayList<>(); //음료 메뉴를 담기 위한 리스트
        drinkBox.addAll(Arrays.asList(
           new MenuItemPro1("Coke", 3.5, "시원하고 청량감이 넘치는 탄산 음료"),
        new MenuItemPro1("환타", 3.5, "오렌지와 파인애플 맛으로 탄산을 즐기자."),
        new MenuItemPro1("사이다", 3.5, "콜라와 더불어 사랑받는 음료"),
        new MenuItemPro1("우유", 3.5, "빵과 어울리는 근본 조합")
        ));

        List<MenuItemPro1> dessertBox = new ArrayList<>();
        dessertBox.addAll(Arrays.asList(
                new MenuItemPro1("French Fry", 2.5, "햄버거와 오랜 단짝"),
                new MenuItemPro1("코올슬로", 3.0, "신선한 샐러드"),
                new MenuItemPro1("치즈스틱", 2.5, "치즈를 길게 늘여뜨려 먹을  수 있는 튀김")

        ));



        //장바구니 리스트 생성
        List <String> shoppingBasket = new ArrayList<>();



        //메서드 사용을 위한 객체 생성
        Scanner sc = new Scanner(System.in); //스캐너 객체 생성
        KioskPro2 Home = new KioskPro2("Home"); //start 함수 사용을 위함
        MenuPro1 menu = new MenuPro1();//메뉴 메서드 사용을 위한 객체 생성
        OrderPro1 order = new OrderPro1(); //장바구니 및 주문 객체 사용을 위함






        boolean flag = true;
        while(flag){

            Home.start(menuBox, shoppingBasket);//메인화면 출력
            System.out.println("메뉴를 선택하세요.");
            int menuNumber = sc.nextInt();

            switch(menuNumber){
                case 1: //버거 메뉴 출력
                    System.out.println("----------------------------------------");
                    System.out.println("[ burgers menu ]");
                    menuNumber= menu.menuItemDisplay(burgerBox, sc); //카테고리에 따른 메뉴 보여주기 및 메뉴 넘버 지정
                    if(menu.selecting( menuNumber, burgerBox)){//선택 보여주기, 종료 버튼 입력시 종료
                        menu.addBasket(shoppingBasket, burgerBox, menuNumber, sc);
                        continue;
                    }
                    System.out.println("뒤로가기");
                    break;

                case 2:
                    System.out.println("----------------------------------------");
                    System.out.println("[ drinks menu ]");
                    menu.menuItemDisplay(drinkBox, sc);
                    if(menu.selecting( menuNumber, drinkBox)){//선택 보여주기, 종료 버튼 입력시 종료
                        menu.addBasket(shoppingBasket, drinkBox, menuNumber, sc);
                        continue;
                    }
                    System.out.println("뒤로가기");
                    break;

                case 3: //디저트 박스
                    System.out.println("----------------------------------------");
                    System.out.println("[ dessert menu ]");
                    menuNumber= menu.menuItemDisplay(dessertBox, sc); //카테고리에 따른 메뉴 보여주기 및 메뉴 넘버 지정
                    if(menu.selecting( menuNumber, dessertBox)){//선택 보여주기, 종료 버튼 입력시 종료
                        menu.addBasket(shoppingBasket, dessertBox, menuNumber, sc);
                        continue;
                    }
                    System.out.println("뒤로가기");
                    break;


                case 4:
                    double total=0;
                    order.checkOrders(shoppingBasket, total);
                    menuNumber =order.checkBuying(sc);

                    if(menuNumber ==1){
                        double discountRate = order.discounting(sc);
                        System.out.println("다음 상품을 구매하였습니다.");
                        total = order.checkOrders(shoppingBasket, total);
                        order.confirmingBuying(shoppingBasket,discountRate, total);
                    }else{
                        break;
                    }

                case 5:
                    shoppingBasket.clear();
                    break;
                case 0:
                    flag = false;
                    break;
            }


        }
        System.out.println("종료");
    }
}
