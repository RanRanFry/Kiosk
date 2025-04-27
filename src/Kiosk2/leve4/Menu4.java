package Kiosk2.leve4;

import java.util.List;

public class Menu4 {


    private List<MenuItem4> itemBox;

    public void menuItemDisplay(List <MenuItem4> itemBox){
        System.out.println("----------------------------------------");
        System.out.println("[ "+ itemBox +" menu ]");
        for(int i=0; i< itemBox.size(); i++){
            System.out.println((i+1) + ".  "+itemBox.get(i).getItemName() + "  |  W " + itemBox.get(i).getPrice() + "  |  "+itemBox.get(i).getDescription() );
        }
        System.out.println("0.  종료  |  뒤로가기");
        System.out.println("----------------------------------------");

    }

    //키오스크-> 메뉴 -> 음식 리스트 순서로들어가므로 메뉴에서 관리하는 게 적당하다.
    // 음식 리스트에는 이미 게터 세터로 기능이 존재하므로 기능을 더 추가하지는 않는다.
    public boolean selecting( int menuNumber, List <MenuItem4> itemBox){
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

    public List<MenuItem4> getItemBox() {
        return itemBox;
    }

    public void setItemBox(List<MenuItem4> itemBox) {
        this.itemBox = itemBox;
    }


}
