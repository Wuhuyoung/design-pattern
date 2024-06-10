package version1.pattern.structure.facade;

/**
 * 智能音箱：对外提供统一操作接口
 */
public class SmartAppliancesFacade {
    private Light light;
    private AirCondition airCondition;
    private TV tv;

    public SmartAppliancesFacade() {
        this.light = new Light();
        this.airCondition = new AirCondition();
        this.tv = new TV();
    }
    //智能音箱语音输入
    public void say(String message) {
        if (message.contains("打开")) {
            on();
        } else if (message.contains("关闭")) {
            off();
        } else {
            System.out.println("我听不清你在说什么");
        }
    }

    private void on() {
        light.on();
        airCondition.on();
        tv.on();
    }
    private void off() {
        light.off();
        airCondition.off();
        tv.off();
    }
}
