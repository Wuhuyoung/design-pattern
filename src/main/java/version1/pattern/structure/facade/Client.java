package version1.pattern.structure.facade;

public class Client {
    public static void main(String[] args) {
        SmartAppliancesFacade smartAppliancesFacade = new SmartAppliancesFacade();
        smartAppliancesFacade.say("打开电器");

        System.out.println("------------------------");
        smartAppliancesFacade.say("关闭电器");
    }
}
