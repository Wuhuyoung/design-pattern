package version2.pattern.founder.factory.factorymethod;

import version2.pattern.founder.factory.factorymethod.factory.IRuleConfigParserFactory;
import version2.pattern.founder.factory.factorymethod.factory.RuleConfigParserFactoryMap;
import version2.pattern.founder.factory.factorymethod.parser.IRuleConfigParser;

import java.util.Objects;

public class RuleConfigSource {
    /**
     * 根据配置文件解析得到配置类
     * @param ruleConfigFilePath
     * @return
     */
    public static RuleConfig load(String ruleConfigFilePath) {
        String fileSuffix = getFileSuffix(ruleConfigFilePath);
        IRuleConfigParserFactory parserFactory = RuleConfigParserFactoryMap.getParserFactory(fileSuffix);
        if (Objects.isNull(parserFactory)) {
            throw new RuntimeException("Rule config file format is not supported: " + ruleConfigFilePath);
        }
        // 直接用对应的工厂创建对应的parser
        IRuleConfigParser parser = parserFactory.createParser();

        RuleConfig ruleConfig = parser.parse(ruleConfigFilePath);
        return ruleConfig;
    }

    /**
     * 解析文件名获取扩展后缀名
     * @param filePath
     * @return
     */
    private static String getFileSuffix(String filePath) {
        return "json";
    }
}
