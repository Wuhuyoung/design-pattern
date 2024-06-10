package version1.pattern.behavior.mediator;

/**
 * 房屋拥有者
 */
public class HouseOwner extends Person {
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void communicate(String message) {
        mediator.communicate(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("房主" + name + "收到:" + message);
    }
}
