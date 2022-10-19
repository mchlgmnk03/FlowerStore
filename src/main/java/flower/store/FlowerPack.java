package flower.store;
import lombok.Setter;
import lombok.Getter;

@Setter @Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;
    public double get_price() {
        return quantity * flower.getPrice();
    }
}
