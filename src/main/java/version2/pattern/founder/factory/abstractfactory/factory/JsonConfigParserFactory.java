package version2.pattern.founder.factory.abstractfactory.factory;

import version2.pattern.founder.factory.abstractfactory.parser.IRuleConfigParser;
import version2.pattern.founder.factory.abstractfactory.parser.ISystemConfigParser;
import version2.pattern.founder.factory.abstractfactory.parser.JsonRuleConfigParser;
import version2.pattern.founder.factory.abstractfactory.parser.JsonSystemConfigParser;

/**
 * Json解析器工厂
 * 同时创建多个类型的工厂，避免工厂类过多
 */
public class JsonConfigParserFactory implements IConfigParserFactory {
    @Override
    public IRuleConfigParser createRuleParser() {
        return new JsonRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new JsonSystemConfigParser();
    }
}
