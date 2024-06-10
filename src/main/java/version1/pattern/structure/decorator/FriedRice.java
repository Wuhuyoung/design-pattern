package version1.pattern.structure.decorator;

/**
 * 炒饭类，具体构件类
 */
public class FriedRice extends FastFood {

    public FriedRice() {
        super(10, "炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
