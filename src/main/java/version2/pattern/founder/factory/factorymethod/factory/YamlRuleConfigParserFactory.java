package version2.pattern.founder.factory.factorymethod.factory;

import version2.pattern.founder.factory.factorymethod.parser.IRuleConfigParser;
import version2.pattern.founder.factory.factorymethod.parser.YamlRuleConfigParser;

/**
 * Yaml配置文件解析器 创建工厂
 */
public class YamlRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new YamlRuleConfigParser();
    }
}
