package Kiosk2.pro1;

import java.util.List;
import java.util.Scanner;

public class OrderPro1 {
    //속성
    private String info;



    //생성자
    public OrderPro1(String info) {
        this.info = info;
    }

    //기능
    public String getInfo() {
        return info;
    }

    public double checkOrders(List<String> basket, double cost){
        System.out.println("[ Orders ]");
        for(int i=0; i<basket.size(); i+=4){
            System.out.print(basket.get(i) + "   |  ");
            System.out.print(basket.get(i+1) + "  |  ");
            System.out.print(basket.get(i+2) + "  |  ");
            System.out.println(" 수량:  X " + basket.get(i+3));

            cost += Double.parseDouble(basket.get(i+1)) * Double.parseDouble(basket.get(i+3));
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
        int menuNumber = sc.nextInt();
        return menuNumber;
    }

    public double discounting(Scanner sc){
        System.out.println("할인 정보를  입력해주세요.");
        for (DiscountRate rates : DiscountRate.values() ){
            System.out.print((rates.ordinal()+1) + ".  ");
            System.out.print(rates.name()+"  :  ");
            System.out.println(rates.getRate() + "%");
        }
        int rateNumber = sc.nextInt();
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
        }return rate;
    }



    public void confirmingBuying(List <String> basket, double rate, double cost){
        System.out.println("할인율 : " + (rate*100)+"%" );
        System.out.println("----------------------------------");
        System.out.println("총 주문금액 :  W  " +Math.round((cost * (1-rate)))/100 * 100);
        System.out.println("구매가 완료되었습니다.");
        basket.clear();
    }
}

