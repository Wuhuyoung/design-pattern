package version1.pattern.founder.constructor;

/**
 * ofoBike建造者
 */
public class OfoBuilder implements Builder {
    private Bike bike = new Bike();
    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
