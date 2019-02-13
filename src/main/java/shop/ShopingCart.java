package shop;

import goods.candies.Drops;
import goods.drinks.CocaCola;
import goods.fruits.Apple;

import java.util.ArrayList;

public class ShopingCart {
    private ArrayList<Apple> cartForApples;
    private ArrayList<Drops> cartForDrops;
    private ArrayList<CocaCola> cartForCocaCola;

    public ShopingCart() {
        cartForApples = new ArrayList<Apple>();
        cartForDrops = new ArrayList<Drops>();
        cartForCocaCola = new ArrayList<CocaCola>();
    }

    public void addAppleToCart(Apple apple) {
        cartForApples.add(apple);
    }

    public void addDropsToCart(Drops drops) {
        cartForDrops.add(drops);
    }

    public void addCocaColaToCart(CocaCola cocaCola) {
        cartForCocaCola.add(cocaCola);
    }

    public void printCarts() {
        System.out.println("Apples");
        for (Apple apple : cartForApples) {
            System.out.println("Name:  " + apple.getName() + " Color: " + apple.getColor() + " Pips: " + apple.getNumberOfPips());
        }

        System.out.println("Drops");
        for (Drops drops : cartForDrops) {

            System.out.println("Name:  " + drops.getName() + " Color: " + drops.getPackType());
        }

        System.out.println("CocaCola");
        for (CocaCola cocaCola : cartForCocaCola) {

            System.out.println("Name:  " + cocaCola.getName() + " Volume: " + cocaCola.getVolume() + " Quantity In Pack: " + cocaCola.getQuantityInPack());
        }
    }
}
