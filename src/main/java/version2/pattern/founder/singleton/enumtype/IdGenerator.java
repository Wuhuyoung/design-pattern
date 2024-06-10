package version2.pattern.founder.singleton.enumtype;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 饿汉式：枚举类加载时就会实例化单例对象
 * 通过Java枚举类本身的特性，来保证实例创建的线程安全性和唯一性
 */
public enum IdGenerator {
    INSTANCE;

    private AtomicLong id = new AtomicLong(0L);

    public long getId() {
        return id.incrementAndGet();
    }
}
