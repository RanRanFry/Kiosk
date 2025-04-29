package level4;

import java.util.List;


public class Menu {
    List<MenuItem> items;
    String menuName;

    public Menu(String menuName, List<MenuItem> items) {
        this.menuName = menuName;
        this.items = items;
    }

    public String getMenuName() {
        return this.menuName;
    }

    public List<MenuItem> getItems() {
        return this.items;
    }

    public Menu(List<MenuItem> items) {
        this.items = items;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
}
