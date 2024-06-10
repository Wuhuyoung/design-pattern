package version2.pattern.founder.factory.factorymethod;

import lombok.Data;

/**
 * 配置类
 */
@Data
public class RuleConfig {

    private String extension;

    public RuleConfig(String extension) {
        this.extension = extension;
    }
}
