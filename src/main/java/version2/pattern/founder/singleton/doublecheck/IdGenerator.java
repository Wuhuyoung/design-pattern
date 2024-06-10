package version2.pattern.founder.singleton.doublecheck;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 懒汉式：双重检测
 * 通过double-check避免初始化完成后再加锁
 */
public class IdGenerator {
    private AtomicLong id = new AtomicLong(0L);

    private IdGenerator() {}
    // 使用volatile防止指令重排序导致还没来得及初始化就返回
    private static volatile IdGenerator instance;

    public static IdGenerator getInstance() {
        if (instance == null) {
            synchronized (IdGenerator.class) {
                if (instance == null) { // DCL
                    instance = new IdGenerator();
                }
            }
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
