package version1.pattern.founder.factory.factory_method;

public class CoffeeShop {
    public static void main(String[] args) {
        CoffeeFactory americanFactory = new AmericanCoffeeFactory();
        Coffee coffee = americanFactory.createCoffee();
        coffee.getName();

        LatteCoffeeFactory latteFactory = new LatteCoffeeFactory();
        Coffee coffee1 = latteFactory.createCoffee();
        coffee1.getName();
    }
}
