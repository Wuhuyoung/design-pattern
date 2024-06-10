package version1.pattern.founder.factory.abstract_factory;

/**
 * 生产美式风味食品的工厂
 */
public class AmericanFactory implements Factory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new AmericanDessert();
    }
}
