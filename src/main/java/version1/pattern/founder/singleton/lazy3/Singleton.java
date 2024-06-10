package version1.pattern.founder.singleton.lazy3;

/**
 * 单例模式
 * 懒汉式：线程安全（静态内部类）
 */
public class Singleton {
    // 构造方法私有化
    private Singleton() {}
    // 定义一个静态内部类
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    // 向外界提供获取方法
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
