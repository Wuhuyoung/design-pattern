package version1.pattern.founder.factory.abstract_factory;

/**
 * 意大利风味的甜品
 */
public class ItalyDessert implements Dessert {
    @Override
    public void getName() {
        System.out.println("意大利风味的甜品");
    }
}
