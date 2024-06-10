package version1.pattern.behavior.template;

/**
 * 抽象方法
 */
public abstract class AbstractCooking {

    public final void cooking() {
        pourOil(); //第一步：倒油
        heatOil(); //第二步：热油
        pourVegetable(); //第三步：倒蔬菜
        pourSauce(); //第四步：倒调味料
        fry(); //第五步：翻炒
    }
    public void pourOil() {
        System.out.println("倒油");
    }

    public void heatOil() {
        System.out.println("热油");
    }

    public abstract void pourVegetable();

    public abstract void pourSauce();

    public void fry() {
        System.out.println("炒菜");
    }
}
