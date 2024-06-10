package version1.pattern.behavior.observer;

/**
 * 具体观察者实现类
 */
public class WeixinUser implements Observer {
    private String userName;

    public WeixinUser(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String message) {
        System.out.println(userName + "收到了推送:" + message);
    }
}
