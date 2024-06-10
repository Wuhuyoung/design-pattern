package version1.pattern.structure.decorator;

/**
 * 快餐类，抽象构件类
 */
public abstract class FastFood {
    private float price;
    private String name;

    //计算价格
    public abstract float cost();

    public FastFood() {
    }

    public FastFood(float price, String name) {
        this.price = price;
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
