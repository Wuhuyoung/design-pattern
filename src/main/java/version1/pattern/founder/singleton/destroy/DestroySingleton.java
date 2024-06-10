package version1.pattern.founder.singleton.destroy;

import java.lang.reflect.Constructor;

/**
 * 通过反射破坏单例模式（除了枚举）
 */
public class DestroySingleton {
    public static void main(String[] args) throws Exception {
        // 1.获取Singleton的字节码对象
        Class<Singleton> clazz = Singleton.class;
        // 2.获取Singleton类的私有的无参构造方法
        Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
        // 3.取消访问检查
        constructor.setAccessible(true);
        // 4.通过反射创建对象
        Singleton instance1 = constructor.newInstance();
        Singleton instance2 = constructor.newInstance();

        System.out.println(instance1 == instance2);
    }
}
