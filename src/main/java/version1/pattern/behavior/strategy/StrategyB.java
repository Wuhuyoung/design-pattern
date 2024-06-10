package version1.pattern.behavior.strategy;

/**
 * 具体策略类
 */
public class StrategyB implements Strategy {
    @Override
    public void show() {
        System.out.println("满200元减50元");
    }
}
