package version1.pattern.structure.proxy.jdk_proxy;



/**
 * 火车站
 */
public class TrainStation implements SellTickets {
    @Override
    public void sellTickets() {
        System.out.println("卖票成功");
    }
}
