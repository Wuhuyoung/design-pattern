package version1.pattern.founder.constructor;

/**
 * 抽象建造者 - 定义了组装每个部件的方法
 */
public interface Builder {
    void buildSeat();

    void buildFrame();

    Bike createBike();
}
