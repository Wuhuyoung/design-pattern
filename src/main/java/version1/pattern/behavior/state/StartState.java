package version1.pattern.behavior.state;

public class StartState implements State {
    @Override
    public void start(Context context) {
        // do nothing
    }

    @Override
    public void stop(Context context) {
        System.out.println("change to stop...");
        context.setState(Context.STOP_STATE);
    }

    @Override
    public String toString() {
        return "start state";
    }
}
