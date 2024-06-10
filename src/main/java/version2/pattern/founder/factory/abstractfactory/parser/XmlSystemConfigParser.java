package version2.pattern.founder.factory.abstractfactory.parser;

import version2.pattern.founder.factory.abstractfactory.SystemConfig;

/**
 * Xml配置文件解析器
 */
public class XmlSystemConfigParser implements ISystemConfigParser {
    @Override
    public SystemConfig parse(String ruleConfigFilePath) {
        return new SystemConfig("xml");
    }
}
