package Kiosk2.pro1;

public class MenuItemPro1 {
    String itemName;
    double price;
    String description;


    //생성자
    public MenuItemPro1(String itemName, double price, String description) {
        this.itemName = itemName;
        this.price = price;
        this.description = description;
    }


    //기능
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
