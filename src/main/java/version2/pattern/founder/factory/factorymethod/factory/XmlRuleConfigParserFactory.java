package version2.pattern.founder.factory.factorymethod.factory;

import version2.pattern.founder.factory.factorymethod.parser.IRuleConfigParser;
import version2.pattern.founder.factory.factorymethod.parser.JsonRuleConfigParser;
import version2.pattern.founder.factory.factorymethod.parser.XmlRuleConfigParser;

/**
 * Xml配置文件解析器 创建工厂
 */
public class XmlRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new XmlRuleConfigParser();
    }
}
