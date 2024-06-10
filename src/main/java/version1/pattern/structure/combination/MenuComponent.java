package version1.pattern.structure.combination;

/**
 * 菜单组件  不管是菜单还是菜单项，都应该继承该类
 */
public abstract class MenuComponent {

    protected String name;
    protected int level;

    public MenuComponent(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }
    public abstract void print();
}
