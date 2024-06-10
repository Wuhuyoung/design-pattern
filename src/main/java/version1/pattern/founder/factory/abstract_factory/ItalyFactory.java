package version1.pattern.founder.factory.abstract_factory;

/**
 * 生产意大利风味食品的工厂
 */
public class ItalyFactory implements Factory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new ItalyDessert();
    }
}
