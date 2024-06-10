package version2.pattern.founder.factory.factorymethod.parser;

import version2.pattern.founder.factory.factorymethod.RuleConfig;

/**
 * yaml配置文件解析器
 */
public class YamlRuleConfigParser implements IRuleConfigParser {
    @Override
    public RuleConfig parse(String ruleConfigFilePath) {
        return new RuleConfig("yaml");
    }
}
