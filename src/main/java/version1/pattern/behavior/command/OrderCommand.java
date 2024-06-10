package version1.pattern.behavior.command;


import java.util.Map;

/**
 * 具体命令类：相当于消息队列
 */
public class OrderCommand implements Command {
    //其中聚合了接收者和消息，用来调用接收者处理消息
    private Chef chef;
    private Order order;

    public OrderCommand(Chef chef, Order order) {
        this.chef = chef;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDinningTable() + "桌的订单");
        Map<String, Integer> foodDic = order.getFoodDic();
        foodDic.forEach((name, num) ->
                chef.makeFood(name, num)
        );
    }
}
