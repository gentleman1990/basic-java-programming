package construction.abstracts;

public class Mall extends ShopsAbs {
    @Override
    public double calculateRent() {
        return getBasePrice() * 2.5;
    }
}
