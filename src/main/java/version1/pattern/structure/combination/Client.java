package version1.pattern.structure.combination;

public class Client {
    public static void main(String[] args) {
        Menu menu = new Menu("系统管理", 1);
        Menu menu1 = new Menu("菜单管理", 2);
        Menu menu2 = new Menu("权限管理", 2);
        Menu menu3 = new Menu("角色管理", 2);
        menu.add(menu1, menu2, menu3);

        MenuItem menuItem1 = new MenuItem("页面访问", 3);
        MenuItem menuItem2 = new MenuItem("页面访问", 3);
        MenuItem menuItem3 = new MenuItem("页面访问", 3);
        MenuItem menuItem4 = new MenuItem("页面访问", 3);
        menu1.add(menuItem1, menuItem2, menuItem3);
        menu2.add(menuItem4);

        menu.print();
    }
}
