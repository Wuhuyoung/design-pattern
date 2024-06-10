package version1.pattern.behavior.command;

public class Client {
    public static void main(String[] args) {
        //创建两个订单
        Order order1 = new Order();
        order1.setDinningTable(1);
        order1.setFood("辣椒炒肉", 1);
        order1.setFood("鸡蛋", 2);

        Order order2 = new Order();
        order2.setDinningTable(2);
        order2.setFood("米粉", 2);

        //创建接收者
        Chef chef = new Chef();

        //将订单和接收者封装成命令对象
        Command command1 = new OrderCommand(chef, order1);
        Command command2 = new OrderCommand(chef, order2);

        //创建调用者 waitor
        Waiter waiter = new Waiter();
        waiter.setCommands(command1, command2);
        //调用者发送请求
        waiter.orderUp();
    }
}
