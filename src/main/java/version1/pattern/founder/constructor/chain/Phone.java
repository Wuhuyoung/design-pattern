package version1.pattern.founder.constructor.chain;

/**
 * 建造者模式扩展 - 链式编程原理
 */
public class Phone {
    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;
    //构造方法私有化
    private Phone(Builder builder) {
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainboard = builder.mainboard;
    }

    public static final class Builder {
        private String cpu = "intel";
        private String screen = "三星";
        private String memory = "华硕";
        private String mainboard = "金士顿";
        public Builder() {}

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }
        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }
        public Builder mainboard(String mainboard) {
            this.mainboard = mainboard;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainboard='" + mainboard + '\'' +
                '}';
    }
}
