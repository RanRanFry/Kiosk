package level4;

public class MenuItem {
    private String menuName;
    private double price;
    private String description;

    public MenuItem(String menuName, double price, String description) {
        this.menuName = menuName;
        this.price = price;
        this.description = description;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMenuName() {
        return this.menuName;
    }

    public double getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }
}
