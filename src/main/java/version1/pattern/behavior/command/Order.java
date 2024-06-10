package version1.pattern.behavior.command;

import java.util.HashMap;
import java.util.Map;

/**
 * 相当于请求者和接收者传递的消息
 */
public class Order {
    private Map<String, Integer> foodDic = new HashMap<>();
    private int dinningTable;


    public Map<String, Integer> getFoodDic() {
        return foodDic;
    }

    public void setFood(String name, int num) {
        this.foodDic.put(name, num);
    }

    public int getDinningTable() {
        return dinningTable;
    }

    public void setDinningTable(int dinningTable) {
        this.dinningTable = dinningTable;
    }
}
