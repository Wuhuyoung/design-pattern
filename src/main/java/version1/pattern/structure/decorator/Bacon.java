package version1.pattern.structure.decorator;

/**
 * 培根+主食，其中的成员变量就是主食fastFood，price和name都是培根的属性
 * 具体装饰类
 */
public class Bacon extends Garnish {

    public Bacon(FastFood fastFood) {
        super(fastFood, 2, "培根");
    }

    @Override
    public float cost() {
        // 这里应该是调用getFastFood().cost()而不是getPrice()，
        // 因为里面的FastFood成员变量可能内部还有FastFood变量，形成递归调用
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getName() {
        return super.getName() + getFastFood().getName();
    }
}
