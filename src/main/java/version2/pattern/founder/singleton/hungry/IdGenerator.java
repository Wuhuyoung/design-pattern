package version2.pattern.founder.singleton.hungry;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 饿汉式
 * 优点：采用饿汉式实现方式，将耗时的初始化操作，提前到程序启动的时候完成，这样就能避免在程序运行的时候，再去初始化导致的性能问题
 */
public class IdGenerator {
    private AtomicLong id = new AtomicLong(0L);
    // 不支持延迟加载
    private static final IdGenerator INSTANCE = new IdGenerator();

    private IdGenerator() {}

    public static IdGenerator getInstance() {
        return INSTANCE;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
