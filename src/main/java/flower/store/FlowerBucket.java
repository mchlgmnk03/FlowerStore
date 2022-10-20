package flower.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> flowerPackList = new ArrayList<>();

    public void add(FlowerPack pack) {
        flowerPackList.add(pack);
    }

    public double getPrice() {
        double price = 0.0;
        for (FlowerPack pack : flowerPackList) {
            price += pack.getPrice();
        }
        return price;
    }

}
