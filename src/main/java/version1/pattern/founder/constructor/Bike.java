package version1.pattern.founder.constructor;

/**
 * 建造者模式 - 具体产品类
 */

public class Bike {
    @Override
    public String toString() {
        return "Bike{" +
                "seat='" + seat + '\'' +
                ", frame='" + frame + '\'' +
                '}';
    }

    private String seat;
    private String frame;

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }
}
