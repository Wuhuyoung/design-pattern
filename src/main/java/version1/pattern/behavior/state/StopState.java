package version1.pattern.behavior.state;

public class StopState implements State {
    @Override
    public void start(Context context) {
        System.out.println("change to start...");
        context.setState(Context.START_STATE);
    }

    @Override
    public void stop(Context context) {
        //do nothing...
    }

    @Override
    public String toString() {
        return "stop state";
    }
}
