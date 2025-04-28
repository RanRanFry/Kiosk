package Kiosk2.pro1;



import java.util.List;

public class KioskPro2 {

    private String categoryName; //메뉴 카테고리 이름
    List <MenuPro1> menus;




    //생성자
    public KioskPro2(String categoryName) {
        this.categoryName = categoryName;
    }


    //기능

    public void start(List<KioskPro2> itemBox, List basket ){
        System.out.println("----------------------------------------");
        System.out.println("[ Main Menu ]");
        for(int i=1; i< itemBox.size(); i++){
            System.out.println((i) + ".  "+itemBox.get(i).getCategoryName());
        }
        System.out.println((0) + ".  "+itemBox.get(0).getCategoryName());

        if(!basket.isEmpty()){
            System.out.println("[ ORDER Menu ]");
            System.out.println("4. Orders  |장바구니를 확인 후 주문합니다.");
            System.out.println("5. Cancel  | 진행중인 주문을 취소합니다.");
        }
        System.out.println("----------------------------------------");

    }

    public String getCategoryName() {
        return categoryName;
    }


}
