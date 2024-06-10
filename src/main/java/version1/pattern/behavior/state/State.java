package version1.pattern.behavior.state;

/**
 * 抽象状态类
 */
public interface State {

    void start(Context context);

    void stop(Context context);
}
