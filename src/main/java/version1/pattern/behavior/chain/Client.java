package version1.pattern.behavior.chain;

public class Client {
    public static void main(String[] args) {
        //创建请假条
        LeaveRequest request = new LeaveRequest("张三", 5, "生病");
        LeaveRequest request2 = new LeaveRequest("李四", 2, "生病");
        LeaveRequest request3 = new LeaveRequest("王五", 10, "生病");

        Handler chainPoint = getChain();
        chainPoint.submit(request);
        chainPoint.submit(request2);
        chainPoint.submit(request3);
    }

    public static Handler getChain() {
        //创建小组长、经理、总经理的调用链
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        return groupLeader;
    }
}
