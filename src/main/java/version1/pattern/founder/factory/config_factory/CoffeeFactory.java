package version1.pattern.founder.factory.config_factory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 咖啡工厂 - 利用配置文件加载咖啡对象
 */
public class CoffeeFactory {
    // 提前存储咖啡对象，在工厂类加载时就初始化，保证每个对象都是单例的，需要时直接从工厂中取
    private static Map<String, Coffee> map = new HashMap<>();

    // 使用静态代码块，保证只执行一次
    static {
        Properties properties = new Properties();
        InputStream inputStream = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            properties.load(inputStream);
            for (Object key : properties.keySet()) {
                // 获取全类名
                String className = properties.getProperty((String) key);
                Class<?> clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.newInstance(); //反射创建对象
                map.put((String) key, coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Coffee getCoffee(String name) {
        return map.get(name);
    }
}
