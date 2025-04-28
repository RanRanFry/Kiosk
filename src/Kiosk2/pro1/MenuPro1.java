package Kiosk2.pro1;



import java.util.List;
import java.util.Scanner;
public class MenuPro1 {

    private List<MenuItemPro1> itemBox;
    List <OrderPro1> orders;

    public int menuItemDisplay(List<MenuItemPro1> itemBox, Scanner sc) {
        for (int i = 0; i < itemBox.size(); i++) {
            System.out.println((i + 1) + ".  " + itemBox.get(i).getItemName() + "  |  W " + itemBox.get(i).getPrice() + "  |  " + itemBox.get(i).getDescription());
        }
        System.out.println("0.  종료  |  뒤로가기");
        System.out.println("----------------------------------------");
        System.out.println("메뉴를 선택하세요.");
        int num = sc.nextInt();
        return num;
    }

    //키오스크-> 메뉴 -> 음식 리스트 순서로들어가므로 메뉴에서 관리하는 게 적당하다.
    // 음식 리스트에는 이미 게터 세터로 기능이 존재하므로 기능을 더 추가하지는 않는다.
    public boolean selecting( int menuNumber, List <MenuItemPro1> itemBox){
        if(menuNumber ==0){
            System.out.println("뒤로가기");
            return false;
        }else{
            System.out.print("선택한 메뉴:  ");
            System.out.print(itemBox.get(menuNumber-1).getItemName()+ "   ");
            System.out.print(itemBox.get(menuNumber-1).getPrice()+"   ");
            System.out.print(itemBox.get(menuNumber-1).getDescription());
            System.out.println("\n");

        }return true;
    }

    public  void addBasket(List <String> basket,List <MenuItemPro1> itemBox, int  menuNumber,Scanner sc){
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인         2. 취소");
        int moveNumber = sc.nextInt();
        String orderName = itemBox.get(menuNumber - 1).getItemName();
        String price = String.valueOf(itemBox.get(menuNumber - 1).getPrice());
        String orderDescription = itemBox.get(menuNumber - 1).getDescription();

        if(moveNumber==1){
            basket.add(orderName);
            basket.add(price);
            basket.add(orderDescription);
            System.out.println("얼마나 담으시겠습니까?");
            int quantity = sc.nextInt();
            basket.add(String.valueOf(quantity));
        }
    }
}
