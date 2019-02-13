package goods;

import goods.candies.Drops;
import goods.drinks.CocaCola;
import goods.fruits.Apple;
import shop.ShopingCart;

public class GroceryShop {
    public static void main(String[] args) {
        ShopingCart cart = new ShopingCart();
        cart.addAppleToCart(new Apple("Jonagold", "Red", 20));
        cart.addCocaColaToCart(new CocaCola("CocaCola Original", 1.5, 6));
        cart.addDropsToCart(new Drops("Michałki", "Plastic"));
        cart.addAppleToCart(new Apple("Ligol", "Orange", 10));

        cart.printCarts();
    }
}