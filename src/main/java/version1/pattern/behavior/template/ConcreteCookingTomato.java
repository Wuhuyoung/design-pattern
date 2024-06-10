package version1.pattern.behavior.template;

public class ConcreteCookingTomato extends AbstractCooking {
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是西红柿");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是芝士");
    }
}
