package flower.store;
import lombok.Setter;
import lombok.Getter;

@Setter @Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;


    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }

    public double get_price() {
        return quantity * flower.getPrice();
    }
}
