package Kiosk2.leve4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        List <Kiosk4> menuBox = new ArrayList<>(); //메뉴들을 담기 위한 리스트
        menuBox.addAll(Arrays.asList(
                new Kiosk4("종료    |    종료"),
           new Kiosk4("Burgers"),
                new Kiosk4("Drinks"),
                new Kiosk4("Desserts")
        ));

        List<MenuItem4> burgerBox = new ArrayList<>(); //버거 메뉴를 담기 위한 리스트
        burgerBox.addAll(Arrays.asList(
                new MenuItem4("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                new MenuItem4("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
                new MenuItem4("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
                new MenuItem4("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")
        ));


        //메서드 사용을 위한 객체 생성
        Scanner sc = new Scanner(System.in); //스캐너 객체 생성
        Kiosk4 Home = new Kiosk4("Home"); //start 함수 사용을 위함
        Menu4 menu = new Menu4();//

        boolean flag = true;
        while(flag){
            Home.start(menuBox);//메인화면 출력
            System.out.println("메뉴를 선택하세요.");
            int menuNumber = sc.nextInt();
            switch(menuNumber){
                case 1: //버거 메뉴 출력
                    menu.menuItemDisplay(burgerBox);
                    System.out.println("메뉴를 선택하세요.");
                    menuNumber = sc.nextInt();
                    if(!menu.selecting( menuNumber, burgerBox)){ //선택 보여주기, 종료 버튼 입력시 종료
                        continue;
                    }
                    System.out.println("뒤로가기");
                    break;
                case 0:
                    flag = false;
                    break;
            }

        }
        System.out.println("종료");
    }
}
