package Kiosk2.level2;

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

        //Scanner 선언


        while (true){
            Scanner sc = new Scanner(System.in);

            if (extracted(burgerBox, sc)) break;
        }





    }

    private static boolean extracted(List<MenuItem> burgerBox, Scanner sc) {
        for(int i = 0; i< burgerBox.size(); i++){
            System.out.println((i+1) + ".  "+ burgerBox.get(i).getItemName() + "  |  W " + burgerBox.get(i).getPrice() + "  |  "+ burgerBox.get(i).getDescription() );
        }
        System.out.println("0.  종료  |  종료");

        int menuNumber = sc.nextInt();
        if(menuNumber ==0){
            return true;
        }else{
            System.out.print("선택한 메뉴:  ");
            System.out.print(burgerBox.get(menuNumber-1).getItemName()+ "   ");
            System.out.print(burgerBox.get(menuNumber-1).getPrice()+"   ");
            System.out.print(burgerBox.get(menuNumber-1).getDescription());
            System.out.println("\n");
        }
        return false;
    }
}
