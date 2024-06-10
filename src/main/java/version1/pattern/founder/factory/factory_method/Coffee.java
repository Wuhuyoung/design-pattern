package version1.pattern.founder.factory.factory_method;

/**
 * 咖啡类
 */
public abstract class Coffee {

    public abstract void getName();

    public void addSugar() {
        System.out.println("加糖");
    }
    public void addMilk() {
        System.out.println("加牛奶");
    }
}