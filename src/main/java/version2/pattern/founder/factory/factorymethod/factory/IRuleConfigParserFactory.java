package version2.pattern.founder.factory.factorymethod.factory;

import version2.pattern.founder.factory.factorymethod.parser.IRuleConfigParser;

/**
 * 配置文件解析器 创建工厂
 * 如果创建单个parser的过程进一步复杂化，则需要单独的工厂来实现
 * 优点：当我们新增一种parser时，只需要新增一个实现了IRuleConfigParserFactory接口的Factory类即可，更加符合开闭原则
 */
public interface IRuleConfigParserFactory {
    IRuleConfigParser createParser();
}
