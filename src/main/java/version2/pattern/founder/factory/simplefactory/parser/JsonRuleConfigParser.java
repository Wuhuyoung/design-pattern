package version2.pattern.founder.factory.simplefactory.parser;

import version2.pattern.founder.factory.simplefactory.RuleConfig;

/**
 * Json配置文件解析器
 */
public class JsonRuleConfigParser implements IRuleConfigParser {
    @Override
    public RuleConfig parse(String ruleConfigFilePath) {
        return new RuleConfig("json");
    }
}
