package version2.pattern.founder.factory.abstractfactory.parser;

import version2.pattern.founder.factory.abstractfactory.SystemConfig;

/**
 * 配置文件解析器
 */
public interface ISystemConfigParser {
    /**
     * 从ruleConfigFilePath文件中读取配置
     * @param ruleConfigFilePath
     * @return
     */
    SystemConfig parse(String ruleConfigFilePath);
}
