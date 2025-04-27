package Kiosk2.level3;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    List<MenuItem> itemBox;


     //MenuItem을 관리하는 리스트 필드



    public void start(List <MenuItem> itemBox){
        for(int i=0; i< itemBox.size(); i++){
            System.out.println((i+1) + ".  "+itemBox.get(i).getItemName() + "  |  W " + itemBox.get(i).getPrice() + "  |  "+itemBox.get(i).getDescription() );
        }
        System.out.println("0.  종료  |  종료");

    }
    public boolean selecting( int menuNumber, List <MenuItem> itemBox){
        boolean flag =true;
        if(menuNumber ==0){
            return false;
        }else{
            System.out.print("선택한 메뉴:  ");
            System.out.print(itemBox.get(menuNumber-1).getItemName()+ "   ");
            System.out.print(itemBox.get(menuNumber-1).getPrice()+"   ");
            System.out.print(itemBox.get(menuNumber-1).getDescription());
            System.out.println("\n");

        }return true;
    }
}
