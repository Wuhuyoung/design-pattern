package version1.pattern.founder.singleton.lazy2;

/**
 * 单例模式
 * 懒汉式：线程安全（双重检查锁）
 */
public class Singleton {
    // 构造方法私有化
    private Singleton() {
    }

    // 声明一个单例对象（添加 volatile 防止指令重排序）
    private static volatile Singleton instance;

    // 向外界提供获取方法
    public static Singleton getInstance() {
        // 第一判断，如果不为null直接返回，不用获取锁
        if (instance == null) {
            synchronized (Singleton.class) {
                // 第二次判断
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
/*
 给私有变量加 volatile 主要是为了防止"instance = new Singleton()"执行时的指令重排序的，
 这行代码看似只是一个创建对象的过程，然而它的实际执行却分为以下 3 步：
  1. 创建内存空间。
  2. 在内存空间中初始化对象 Singleton。
  3. 将内存地址赋值给 instance 对象（执行了此步骤，instance 就不等于 null 了）。
   试想一下，如果不加 volatile，那么线程 1 在执行到上述代码时就可能会执行指令重排序，
 将原本是 1、2、3 的执行顺序，重排为 1、3、2。但是特殊情况下，线程 1 在执行完第 3 步之后，
 如果来了线程 2 执行到上述代码的"instance == null"，判断 instance 对象已经不为 null，
 但此时线程 1 还未将对象实例化完，那么线程 2 将会得到一个被实例化“一半”的对象，从而导致程序执行出错，
 这就是为什么要给私有变量添加 volatile 的原因了。
 */
