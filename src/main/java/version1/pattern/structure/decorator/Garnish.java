package version1.pattern.structure.decorator;

/**
 * 抽象装饰类：继承FastFood抽象构件类，同时聚合了抽象构件类
 */
public abstract class Garnish extends FastFood {
    // 继承是为了方便将其再转化为FastFood类，下次还可以当作一个原生FastFood类传入构造方法中
    // 同时内部聚合FastFood，这样新传入的FastFood就放到成员变量中
    private FastFood fastFood;

    public Garnish(FastFood fastFood, float price, String name) {
        super(price, name);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}
