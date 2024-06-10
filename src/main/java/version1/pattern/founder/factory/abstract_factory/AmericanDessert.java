package version1.pattern.founder.factory.abstract_factory;

/**
 * 美式风味的甜品
 */
public class AmericanDessert implements Dessert {
    @Override
    public void getName() {
        System.out.println("美式风味的甜品");
    }
}
