package version1.pattern.behavior.mediator;

/**
 * 抽象同事类
 */
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    // 与中介沟通
    public abstract void communicate(String message);

    // 获取信息
    public abstract void getMessage(String message);
}
