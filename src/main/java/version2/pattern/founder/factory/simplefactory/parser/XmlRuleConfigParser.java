package version2.pattern.founder.factory.simplefactory.parser;

import version2.pattern.founder.factory.simplefactory.RuleConfig;

/**
 * xml配置文件解析器
 */
public class XmlRuleConfigParser implements IRuleConfigParser {
    @Override
    public RuleConfig parse(String ruleConfigFilePath) {
        return new RuleConfig("xml");
    }
}
