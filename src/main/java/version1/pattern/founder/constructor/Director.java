package version1.pattern.founder.constructor;

/**
 * 指挥者类
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        Bike bike = builder.createBike();
        return bike;
    }
}
