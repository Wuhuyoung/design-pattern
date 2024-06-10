package version1.pattern.behavior.strategy;

public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.showSalesStrategy();

        System.out.println("================");
        salesMan.setStrategy(new StrategyB()); //避免了使用if-else判断，而是使用多个实现类来代替
        salesMan.showSalesStrategy();
    }
}
