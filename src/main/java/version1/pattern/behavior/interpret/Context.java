package version1.pattern.behavior.interpret;

import java.util.HashMap;
import java.util.Map;

/**
 * 环境类，存储数据
 */
public class Context {
    private Map<Variable, Integer> map = new HashMap<>();

    public void assign(Variable var, Integer num) {
        map.put(var, num);
    }

    public int getValue(Variable var) {
        return map.get(var);
    }
}
