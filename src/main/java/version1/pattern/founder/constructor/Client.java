package version1.pattern.founder.constructor;

public class Client {
    public static void main(String[] args) {
        Director director = new Director(new OfoBuilder());
        System.out.println(director.construct());

        Director director1 = new Director(new MobileBuilder());
        System.out.println(director1.construct());
    }
}
