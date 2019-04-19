package construction.abstracts;

public abstract class ShopsAbs {
    private final int basePrice = 50;

    public abstract double calculateRent();

    public double getBasePrice() {
       return basePrice;
    }
}
