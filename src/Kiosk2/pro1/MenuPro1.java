package Kiosk2.pro1;



import java.util.InputMismatchException;
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


        while(true){ // 예외 처리 구문
            try{
                System.out.println("메뉴를 선택하세요.");
                int num = sc.nextInt();

                if ((num >= 0 && num <= itemBox.size())){
                    return num;
                }
                else{
                    System.out.println("잘못된 입력입니다.");
                    throw new InputMismatchException();
                }
            }catch (InputMismatchException e){
                System.out.println("잘못된 형식입니다. 다시 입력하세요.");
                sc.next();
            }
        }
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

    public  void addBasket(List <MenuItemPro1> basket,List <MenuItemPro1> itemBox, int  menuNumber,Scanner sc){
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인         2. 취소");
        int moveNumber = sc.nextInt();

        while(moveNumber !=1 && moveNumber !=2) //예외처리
        {
            try{
                System.out.println("잘못된 입력입니다. 다시 입력해주세요. ");
                moveNumber = sc.nextInt();
            }catch(InputMismatchException e){
                System.out.println("잘못된 형식입니다. 숫자를 입력하세요.");
                moveNumber = sc.nextInt();
            }
        }



        if(moveNumber==1){
            System.out.println("얼마나 담으시겠습니까?");
            int quantity = sc.nextInt();
            itemBox.get(menuNumber-1).setQuantity(quantity);
            basket.add(itemBox.get(menuNumber-1));
        }
    }
}
