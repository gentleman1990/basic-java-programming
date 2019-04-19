package construction.abstracts;

public class Grocery extends ShopsAbs  {
    @Override
    public double calculateRent() {
        return getBasePrice() * 0.5;
    }
}
