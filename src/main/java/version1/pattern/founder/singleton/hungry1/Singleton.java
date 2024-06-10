package version1.pattern.founder.singleton.hungry1;

/**
 * 单例模式
 * 饿汉式：静态成员变量
 */
public class Singleton {
    // 构造方法私有化（防止外界创建对象）
    private Singleton() {}
    // 成员位置创建对象
    private static Singleton instance = new Singleton();
    // 给外界提供获取对象的方法
    public static Singleton getInstance() {
        return instance;
    }
}
