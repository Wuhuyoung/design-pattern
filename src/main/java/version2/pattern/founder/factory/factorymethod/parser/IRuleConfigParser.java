package version2.pattern.founder.factory.factorymethod.parser;

import version2.pattern.founder.factory.factorymethod.RuleConfig;

/**
 * 配置文件解析器
 */
public interface IRuleConfigParser {
    /**
     * 从ruleConfigFilePath文件中读取配置
     * @param ruleConfigFilePath
     * @return
     */
    RuleConfig parse(String ruleConfigFilePath);
}
