package version1.pattern.behavior.chain;

/**
 * 具体处理者
 */
public class Manager extends Handler {

    public Manager() {
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println("批准" + leave.getName() + "请假" + leave.getNum() + "天:" + leave.getContent());
        System.out.println("项目经理同意");
    }
}
