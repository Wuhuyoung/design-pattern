package version1.pattern.behavior.state;

/**
 * 环境类
 */
public class Context {
    public static final StartState START_STATE = new StartState();
    public static final StopState STOP_STATE = new StopState();

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void start() {
        this.state.start(this);
    }

    public void stop() {
        this.state.stop(this);
    }
}
