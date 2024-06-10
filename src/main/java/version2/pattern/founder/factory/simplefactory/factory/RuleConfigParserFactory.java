package version2.pattern.founder.factory.simplefactory.factory;

import org.apache.commons.lang3.StringUtils;
import version2.pattern.founder.factory.simplefactory.parser.IRuleConfigParser;
import version2.pattern.founder.factory.simplefactory.parser.JsonRuleConfigParser;
import version2.pattern.founder.factory.simplefactory.parser.XmlRuleConfigParser;
import version2.pattern.founder.factory.simplefactory.parser.YamlRuleConfigParser;

import java.util.HashMap;
import java.util.Map;

/**
 * 配置文件解析器 简单工厂
 * 如果具体的parser可以复用，可以将parser事先创建好缓存起来，需要时直接使用
 */
public class RuleConfigParserFactory {

    private static final Map<String, IRuleConfigParser> cachedParsers = new HashMap<>();

    static {
        cachedParsers.put("json", new JsonRuleConfigParser());
        cachedParsers.put("xml", new XmlRuleConfigParser());
        cachedParsers.put("yaml", new YamlRuleConfigParser());
    }

    /**
     * 根据文件后缀获取对应的parser
     * @param configFormat
     * @return
     */
    public static IRuleConfigParser createParser(String configFormat) {
        if (StringUtils.isBlank(configFormat)) {
            return null;
        }
        IRuleConfigParser parser = cachedParsers.get(configFormat.toLowerCase());
        return parser;
    }
}
