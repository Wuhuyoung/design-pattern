package version1.pattern.structure.proxy.cglib_proxy;

public class Client {
    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();
        TrainStation station = factory.createProxy();
        station.sellTickets();
    }
}
