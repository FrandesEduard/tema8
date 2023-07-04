package tema8.ex1;

import tema8.ex1.advertiseInterface;

public class facebook implements advertiseInterface {
    private String retailerName;

    public facebook(String retailerName) {
        this.retailerName = retailerName;
    }

    public String getRetailerName() {
        return retailerName;
    }

    @Override
    public String itemAdvertised(String name) {

        return name;
    }
}
