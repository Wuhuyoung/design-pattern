package version1.pattern.founder.factory.abstract_factory;

public class Client {
    public static void main(String[] args) {
        AmericanFactory factory = new AmericanFactory();
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        coffee.getName();
        dessert.getName();
    }
}
