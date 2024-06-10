package version2.pattern.founder.factory.abstractfactory.factory;

import version2.pattern.founder.factory.abstractfactory.parser.IRuleConfigParser;
import version2.pattern.founder.factory.abstractfactory.parser.ISystemConfigParser;

/**
 * 解析器 抽象工厂
 * 可以创建多个不同类型的对象
 */
public interface IConfigParserFactory {
    IRuleConfigParser createRuleParser();

    ISystemConfigParser createSystemParser();
}
