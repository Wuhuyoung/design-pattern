package version1.pattern.behavior.chain;

/**
 * 抽象处理者
 */
public abstract class Handler {
    public static final int NUM_ONE = 1;
    public static final int NUM_THREE = 3;
    public static final int NUM_SEVEN = 7;

    private int startNum;
    private int endNum;
    private Handler nextHandler;

    public Handler(int startNum) {
        this.startNum = startNum;
    }

    public Handler(int startNum, int endNum) {
        this.startNum = startNum;
        this.endNum = endNum;
    }
    //设置下一级处理者
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //提交请假条
    public final void submit(LeaveRequest leave) {
        if (leave.getNum() >= this.startNum && (leave.getNum() <= this.endNum || this.endNum == 0)) {
            handleLeave(leave);
            System.out.println("流程结束");
            return;
        }
        if (this.nextHandler != null && leave.getNum() > this.endNum) {
            this.nextHandler.submit(leave);
        } else {
            System.out.println("流程结束");
        }
    }

    //处理请假条
    protected abstract void handleLeave(LeaveRequest leave);
}
