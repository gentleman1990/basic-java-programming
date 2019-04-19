package construction.interfaces.impl;

import construction.interfaces.Shops;

public class Grocery implements Shops {
    @Override
    public double calculateRentPrice() {
        return 5;
    }
}
