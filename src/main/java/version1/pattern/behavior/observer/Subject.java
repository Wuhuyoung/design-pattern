package version1.pattern.behavior.observer;

/**
 * 抽象主题类：被观察者
 */
public interface Subject {
    // 添加观察者
    void attach(Observer observer);
    // 移除观察者
    void detach(Observer observer);
    // 发布消息
    void notifyMsg(String message);
}
