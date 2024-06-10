package version1.pattern.behavior.mediator;

public class Client {
    public static void main(String[] args) {
        MediatorStructure mediator = new MediatorStructure();

        // 房主和租房者只需要知道中介机构即可
        Tenant tenant = new Tenant("张三", mediator);
        HouseOwner owner1 = new HouseOwner("李四", mediator);
        HouseOwner owner2 = new HouseOwner("王五", mediator);

        mediator.addHouseOwner(owner1);
        mediator.addHouseOwner(owner2);
        mediator.addTenant(tenant);

        tenant.communicate("我需要租三室的房子");
        owner1.communicate("我这有三室的房子，你需要租吗");
    }
}
