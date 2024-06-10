package version1.pattern.founder.constructor;

/**
 * 摩拜单车建造者
 */
public class MobileBuilder implements Builder {
    private Bike bike = new Bike();
    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
