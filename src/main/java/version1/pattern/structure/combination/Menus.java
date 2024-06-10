package version1.pattern.structure.combination;

/**
 * 定义了menu才具有的一些方法
 */
public interface Menus {
    //添加菜单
    boolean add(MenuComponent... menuComponent);

    //移除菜单
    boolean remove(MenuComponent... menuComponent);

    //获取子菜单（根据索引）
    MenuComponent getChild(int index);
}
