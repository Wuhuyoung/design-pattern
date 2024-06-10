package version1.pattern.behavior.mediator;

/**
 * 抽象中介者
 */
public interface Mediator {
    // 申明一个联络方法
    void communicate(String message, Person person);
}
