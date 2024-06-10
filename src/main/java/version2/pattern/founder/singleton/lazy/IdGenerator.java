package version2.pattern.founder.singleton.lazy;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 懒汉式
 * 使用synchronized保证线程安全，但是并发度低
 */
public class IdGenerator {
    private AtomicLong id = new AtomicLong(0L);
    private IdGenerator() {}
    private static IdGenerator instance;

    public synchronized static IdGenerator getInstance() {
        if (instance == null) {
            instance = new IdGenerator();
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
