package Kiosk2.leve4;



import java.util.List;

public class Kiosk4 {



    private String categoryName; //메뉴 카테고리 이름




    //생성자
    public Kiosk4(String categoryName) {
        this.categoryName = categoryName;
    }


    //기능

    public void start(List <Kiosk4> itemBox){
        System.out.println("----------------------------------------");
        System.out.println("[ Main Menu ]");
        for(int i=1; i< itemBox.size(); i++){
            System.out.println((i) + ".  "+itemBox.get(i).getCategoryName());
        }
        System.out.println((0) + ".  "+itemBox.get(0).getCategoryName());
        System.out.println("----------------------------------------");
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

}
