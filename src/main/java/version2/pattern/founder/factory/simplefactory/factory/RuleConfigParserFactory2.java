package version2.pattern.founder.factory.simplefactory.factory;

import org.apache.commons.lang3.StringUtils;
import version2.pattern.founder.factory.simplefactory.parser.IRuleConfigParser;
import version2.pattern.founder.factory.simplefactory.parser.JsonRuleConfigParser;
import version2.pattern.founder.factory.simplefactory.parser.XmlRuleConfigParser;
import version2.pattern.founder.factory.simplefactory.parser.YamlRuleConfigParser;

/**
 * 配置文件解析器 简单工厂
 * 如果每次获取都需要创建新的parser，就不能用map缓存，必须重新创建
 */
public class RuleConfigParserFactory2 {
    /**
     * 根据文件后缀获取对应的parser
     * @param configFormat
     * @return
     */
    public static IRuleConfigParser createParser(String configFormat) {
        if (StringUtils.isBlank(configFormat)) {
            return null;
        }
        if ("json".equalsIgnoreCase(configFormat)) {
            return new JsonRuleConfigParser();
        } else if ("xml".equalsIgnoreCase(configFormat)) {
            return new XmlRuleConfigParser();
        } else if ("yaml".equalsIgnoreCase(configFormat)) {
            return new YamlRuleConfigParser();
        } else {
            return null;
        }
    }
}
