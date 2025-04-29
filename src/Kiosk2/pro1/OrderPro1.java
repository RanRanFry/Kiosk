package Kiosk2.pro1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class OrderPro1 {
    //속성
    private List <MenuItemPro1> plusItem;

    public OrderPro1() {
    }

    public double checkOrders(List<MenuItemPro1> itemBox){
        System.out.println("[ Orders ]");
        double cost=0;
        for(int i=0; i<itemBox.size(); i++){
            System.out.print(itemBox.get(i).getItemName() + "   |  ");
            System.out.print(" W " +itemBox.get(i).getPrice() + "  |  ");
            System.out.print(itemBox.get(i).getDescription() + "  |  ");
            System.out.println(" 수량:  X " + itemBox.get(i).getQuantity());


            cost += (itemBox.get(i).getPrice()) * (itemBox.get(i).getQuantity());  // 곱하기 수량 필요
        }
        System.out.println("\n");
        System.out.println(" [ Total ] ");
        double totalCost = Math.round(cost*100)/100.0;
        System.out.println(" W "+totalCost);
        return totalCost;
    }

    public int checkBuying(Scanner sc){
        System.out.println("구매하시겠습니까?");
        System.out.println("1. 주문    | 2. 추가");
        String tempt = """
                
                
                
                """;
        while (true) {
            try {
                int menuNumber = sc.nextInt();
                if (menuNumber == 1 | menuNumber == 2) {
                    return menuNumber;
                }
                System.out.println("잘못된 입력입니다. 다시 입력해주세요. ");
                menuNumber = sc.nextInt();
                return menuNumber;
            } catch (InputMismatchException e) {
                System.out.println("숫자가 아닌 입력입니다. 다시 입력해주세요.");
                sc.nextInt();
            }
        }
    }

    public double discounting(Scanner sc){
        System.out.println("할인 정보를  입력해주세요.");
        for (DiscountRate rates : DiscountRate.values() ){
            System.out.print((rates.ordinal()+1) + ".  ");
            System.out.print(rates.name()+"  :  ");
            System.out.println(rates.getRate() + "%");
        }

        int rateNumber=4;
        try{
             rateNumber = sc.nextInt();

        }catch (InputMismatchException e){
            System.out.println("잘못된 입력입니다.");
            sc.nextInt(); //버퍼 삭제
        }

        double rate =0;

        switch(rateNumber){
            case 1:
                rate = 0.1;
                break;
            case 2:
                rate = 0.05;
                break;
            case 3:
                rate = 0.03;
                break;
            case 4:
                rate = 0;
                break;

            default:
                break;
        }return rate;
    }



    public void confirmingBuying( double rate, double cost){
        System.out.println("할인율 : " + (rate*100)+"%" );
        System.out.println("----------------------------------");
        System.out.println("총 주문금액 :  W  " +Math.round((cost * (1-rate))));
        System.out.println("구매가 완료되었습니다.");

    }
}

