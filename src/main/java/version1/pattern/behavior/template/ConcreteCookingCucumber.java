package version1.pattern.behavior.template;

public class ConcreteCookingCucumber extends AbstractCooking {
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是黄瓜");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是辣椒");
    }
}
