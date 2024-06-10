package version1.pattern.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 中介机构
 */
public class MediatorStructure implements Mediator {

    private List<HouseOwner> houseOwners;
    private List<Tenant> tenants;

    public MediatorStructure() {
        houseOwners = new ArrayList<>();
        tenants = new ArrayList<>();
    }

    public void addHouseOwner(HouseOwner houseOwner) {
        if (!houseOwners.contains(houseOwner)) {
            houseOwners.add(houseOwner);
        }
    }

    public void addTenant(Tenant tenant) {
        if (!tenants.contains(tenant)) {
            tenants.add(tenant);
        }
    }

    @Override
    public void communicate(String message, Person person) {
        if (person instanceof Tenant) {
            for (HouseOwner houseOwner : houseOwners) {
                houseOwner.getMessage(message);
            }
        } else if (person instanceof HouseOwner) {
            for (Tenant tenant : tenants) {
                tenant.getMessage(message);
            }
        }
    }
}
