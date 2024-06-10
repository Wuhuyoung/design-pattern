package version1.pattern.behavior.state;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(Context.START_STATE);

        context.start();
        context.stop();
        System.out.println(context.getState());

        context.start();
        System.out.println(context.getState());
    }
}
