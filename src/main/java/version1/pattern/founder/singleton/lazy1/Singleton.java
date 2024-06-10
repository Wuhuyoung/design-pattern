package version1.pattern.founder.singleton.lazy1;

/**
 * 单例模式
 * 懒汉式：线程安全（加锁）
 */
public class Singleton {
    // 构造方法私有化
    private Singleton() {}
    // 声明一个单例对象
    private static Singleton instance;
    // 向外界提供获取方法
    public static synchronized Singleton getInstance() { // 为了线程安全加锁，但是加锁粒度过大
        if (instance == null) { // 第一次使用时才会创建
            instance = new Singleton();
        }
        return instance;
    }
}
