package version2.pattern.founder.factory.simplefactory;

import version2.pattern.founder.factory.simplefactory.parser.IRuleConfigParser;
import version2.pattern.founder.factory.simplefactory.factory.RuleConfigParserFactory;

import java.util.Objects;

public class RuleConfigSource {
    /**
     * 根据配置文件解析得到配置类
     * @param ruleConfigFilePath
     * @return
     */
    public static RuleConfig load(String ruleConfigFilePath) {
        String fileSuffix = getFileSuffix(ruleConfigFilePath);
        IRuleConfigParser parser = RuleConfigParserFactory.createParser(fileSuffix);
        if (Objects.isNull(parser)) {
            throw new RuntimeException("Rule config file format is not supported: " + fileSuffix);
        }
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
