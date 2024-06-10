package version1.pattern.founder.factory.simple_factory;


public class Client {
    public static void main(String[] args) {
        Coffee coffee = SimpleCoffeeFactory.createCoffee("American");
        coffee.addMilk();
        coffee.addSugar();
        coffee.getName();
    }
}
