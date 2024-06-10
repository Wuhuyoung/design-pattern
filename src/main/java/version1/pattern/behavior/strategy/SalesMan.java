package version1.pattern.behavior.strategy;

/**
 * 环境角色:持有一个策略类的引用，最终给客户端调用。
 */
public class SalesMan {
    private Strategy strategy;
    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void showSalesStrategy() {
        strategy.show();
    }
}
