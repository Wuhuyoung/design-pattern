package version1.pattern.behavior.chain;

/**
 * 具体处理者
 */
public class GroupLeader extends Handler {

    public GroupLeader() {
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println("批准" + leave.getName() + "请假" + leave.getNum() + "天:" + leave.getContent());
        System.out.println("小组长同意");
    }
}
