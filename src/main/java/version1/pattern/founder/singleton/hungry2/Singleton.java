package version1.pattern.founder.singleton.hungry2;

/**
 * 单例模式
 * 饿汉式：静态代码块
 */
public class Singleton {
    // 构造方法私有化（防止外界创建对象）
    private Singleton() {}
    // 成员位置声明对象
    private static Singleton instance;
    // 在静态代码块中创建对象 (类加载时就会创建)
    static {
        instance = new Singleton();
    }
    // 向外界提供获取单例的方法
    public static Singleton getInstance() {
        return instance;
    }
}
