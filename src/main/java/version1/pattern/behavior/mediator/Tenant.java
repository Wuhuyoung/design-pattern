package version1.pattern.behavior.mediator;

/**
 * 租客
 */
public class Tenant extends Person {
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void communicate(String message) {
        mediator.communicate(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("租客" + name + "收到:" + message);
    }
}
