package version2.pattern.founder.factory.abstractfactory.parser;

import version2.pattern.founder.factory.abstractfactory.SystemConfig;

/**
 * Json配置文件解析器
 */
public class JsonSystemConfigParser implements ISystemConfigParser {
    @Override
    public SystemConfig parse(String ruleConfigFilePath) {
        return new SystemConfig("json");
    }
}
