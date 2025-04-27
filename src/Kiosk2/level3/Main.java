package Kiosk2.level3;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        List<MenuItem> burgerBox = new ArrayList<>(); //버거 메뉴를 담기 위한 리스트

        burgerBox.addAll(Arrays.asList(
                new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
                new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
                new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")
        ));




        Scanner sc = new Scanner(System.in); //스캐너 객체 생성
        Kiosk kiosk = new Kiosk(); //키오스크 객체 생성


        while(true){
            kiosk.start(burgerBox);//메인화면 출력
            System.out.println("메뉴를 선택하세요.");
            int menuNumber = sc.nextInt();
            if(!kiosk.selecting( menuNumber, burgerBox)){ //선택 보여주기, 종료 버튼 입력시 종료
                break;
            }
        }
    }
}
