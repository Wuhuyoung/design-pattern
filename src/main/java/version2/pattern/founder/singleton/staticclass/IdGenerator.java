package version2.pattern.founder.singleton.staticclass;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 懒汉式：静态内部类
 * 只有当调用 getInstance() 方法时，SingletonHolder 才会被加载，这个时候才会创建 instance
 * instance 的唯一性、创建过程的线程安全性，都由 JVM 来保证
 */
public class IdGenerator {
    private AtomicLong id = new AtomicLong(0L);
    private IdGenerator() {}

    private static class SingletonHolder {
        private static final IdGenerator instance = new IdGenerator();
    }

    public static IdGenerator getInstance() {
        return SingletonHolder.instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
