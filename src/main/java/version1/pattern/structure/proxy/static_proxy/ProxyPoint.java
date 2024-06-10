package version1.pattern.structure.proxy.static_proxy;

/**
 * 代理类，火车站代售点
 */
public class ProxyPoint implements SellTickets {
    //对火车站进行代理，由于是成员变量，所以是编译期间就生成的静态代理
    private TrainStation trainStation = new TrainStation();

    @Override
    public void sellTickets() {
        System.out.println("代售点收取服务费");
        trainStation.sellTickets();
    }
}
