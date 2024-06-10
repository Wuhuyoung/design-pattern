package version1.pattern.founder.factory.simple_factory;

/**
 * 生产咖啡的简单工厂
 */
public class SimpleCoffeeFactory {
    public static Coffee createCoffee(String type) {
        Coffee coffee = null;
        if ("lattee".equalsIgnoreCase(type)) {
            coffee = new LatteCoffee();
        } else if ("american".equalsIgnoreCase(type)) {
            coffee = new AmericanCoffee();
        }
        return coffee;
    }
}
