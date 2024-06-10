package version2.pattern.founder.factory.abstractfactory.parser;

import version2.pattern.founder.factory.abstractfactory.SystemConfig;

/**
 * Yaml配置文件解析器
 */
public class YamlSystemConfigParser implements ISystemConfigParser {
    @Override
    public SystemConfig parse(String ruleConfigFilePath) {
        return new SystemConfig("yaml");
    }
}
