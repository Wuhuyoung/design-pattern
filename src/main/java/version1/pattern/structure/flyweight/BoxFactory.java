package version1.pattern.structure.flyweight;


import java.util.HashMap;

/**
 * 享元工厂-单例
 */
public class BoxFactory {
    //存放享元类对象，实现重用
    private HashMap<String, AbstractBox> cache;

    //单例，私有化构造方法
    private BoxFactory() {
        cache = new HashMap<>();
        cache.put("LBox", new LBox());
        cache.put("OBox", new OBox());
    }
    private static BoxFactory INSTANCE;

    public static BoxFactory getInstance() {
        if (INSTANCE != null) {
            return INSTANCE;
        }
        synchronized (BoxFactory.class) {
            if (INSTANCE == null) {
                INSTANCE = new BoxFactory();
            }
            return INSTANCE;
        }
    }

    public AbstractBox getBox(String key) {
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        return null;
    }

}
