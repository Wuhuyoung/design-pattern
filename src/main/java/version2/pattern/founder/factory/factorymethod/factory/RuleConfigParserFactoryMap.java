package version2.pattern.founder.factory.factorymethod.factory;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 解析器工厂的工厂
 * 因为工厂类只包含方法，不包含成员变量，完全可以复用
 * 不需要每次都创建新的工厂类对象
 */
public class RuleConfigParserFactoryMap {
    private static final Map<String, IRuleConfigParserFactory> cachedFactories = new HashMap<>();

    static {
        cachedFactories.put("json", new JsonRuleConfigParserFactory());
        cachedFactories.put("xml", new XmlRuleConfigParserFactory());
        cachedFactories.put("yaml", new YamlRuleConfigParserFactory());
    }

    /**
     * 获取解析工厂的工厂
     * @param type
     * @return
     */
    public static IRuleConfigParserFactory getParserFactory(String type) {
        if (StringUtils.isBlank(type)) {
            return null;
        }
        IRuleConfigParserFactory factory = cachedFactories.get(type.toLowerCase());
        return factory;
    }
}
