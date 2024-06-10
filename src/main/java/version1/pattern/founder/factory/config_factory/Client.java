package version1.pattern.founder.factory.config_factory;

public class Client {
    public static void main(String[] args) {
        Coffee american = CoffeeFactory.getCoffee("american");
        american.getName();

        Coffee latte = CoffeeFactory.getCoffee("latte");
        latte.getName();

        Coffee coffee = CoffeeFactory.getCoffee("american");
        //获取到的同一类的对象都是同一个对象，满足单例
        System.out.println(american == coffee); // true
    }
}
