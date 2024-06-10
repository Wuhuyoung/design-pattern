package version1.pattern.founder.constructor.chain;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .memory("金士顿")
                .screen("华硕")
                .build();
        System.out.println(phone);
    }
}
