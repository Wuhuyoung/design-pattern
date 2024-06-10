package version1.pattern.founder.singleton.destroy;



/**
 * 单例模式
 * 懒汉式：线程安全（静态内部类）
 */
public class Singleton {
    // 构造方法私有化
    private Singleton() {
        // 防止反射破坏单例模式需要添加的
        if (SingletonHolder.INSTANCE != null) {
            throw new RuntimeException("该类的对象已经创建");
        }
    }
    // 定义一个静态内部类
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    // 向外界提供获取方法
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
