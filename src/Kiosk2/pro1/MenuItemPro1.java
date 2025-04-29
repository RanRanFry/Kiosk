package Kiosk2.pro1;

public class MenuItemPro1 {
    private String itemName;
    private double price;
    private String description;
    private int quantity =1;


    //생성자
    public MenuItemPro1(String itemName, double price, String description) {
        this.itemName = itemName;
        this.price = price;
        this.description = description;
    }

    public MenuItemPro1(String itemName, double price, String description, int qunatity) {
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
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

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
