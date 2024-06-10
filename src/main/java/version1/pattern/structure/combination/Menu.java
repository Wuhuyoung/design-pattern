package version1.pattern.structure.combination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 菜单类
 */
public class Menu extends MenuComponent implements Menus {

    private List<MenuComponent> menuComponentList = new ArrayList<>();

    public Menu(String name, int level) {
        super(name, level);
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
        for (MenuComponent component : menuComponentList) {
            component.print();
        }
    }

    @Override
    public boolean add(MenuComponent... menuComponent) {
        return menuComponentList.addAll(Arrays.asList(menuComponent));
    }

    @Override
    public boolean remove(MenuComponent... menuComponent) {
        return menuComponentList.removeAll(Arrays.asList(menuComponent));
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }
}
