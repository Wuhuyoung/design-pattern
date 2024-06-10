package version1.pattern.behavior.observer;

public class Client {
    public static void main(String[] args) {
        // 公众号（被观察者）
        Subject subject = new SubscriptionSubject();

        // 创建用户
        WeixinUser user1 = new WeixinUser("张三");
        WeixinUser user2 = new WeixinUser("李四");
        WeixinUser user3 = new WeixinUser("小明");

        // 关注（订阅公众号）
        subject.attach(user1);
        subject.attach(user2);
        subject.attach(user3);

        // 公众号更新发出消息给订阅的微信用户
        subject.notifyMsg("今日新闻");
    }
}
