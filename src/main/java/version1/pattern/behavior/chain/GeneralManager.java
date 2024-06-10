package version1.pattern.behavior.chain;

/**
 * 具体处理者
 */
public class GeneralManager extends Handler {

    public GeneralManager() {
        super(Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println("批准" + leave.getName() + "请假" + leave.getNum() + "天:" + leave.getContent());
        System.out.println("总经理同意");
    }
}
