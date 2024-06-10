package version1.pattern.structure.proxy.jdk_proxy;

public class Client {
    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();
        SellTickets proxyObject = factory.getProxyObject();
        proxyObject.sellTickets();
    }
}
