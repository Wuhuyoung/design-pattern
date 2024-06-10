package version2.pattern.founder.factory.abstractfactory;

import lombok.Data;

/**
 * 配置类
 */
@Data
public class SystemConfig {

    private String extension;

    public SystemConfig(String extension) {
        this.extension = extension;
    }
}
