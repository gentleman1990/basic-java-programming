package construction.interfaces.impl;

import construction.interfaces.Shops;

public class Mall implements Shops {
    @Override
    public double calculateRentPrice() {
        return 30;
    }
}
