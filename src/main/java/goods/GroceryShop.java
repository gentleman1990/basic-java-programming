package goods;

import goods.fruits.Apple;

public class GroceryShop {
    //create 3 diffrent object Apple with parameters
    //Jonagold, Red, 10
    //Ligol, Green, 20
    //Rubonola, Red, 5
    //Check in if conditions if color has is the same for each combinations of apple

    public static void main(String[] args) {
        Apple apple = new Apple("Jonagold", "Red", 10);
        Apple apple2 = new Apple("Ligol", "Green", 20);
        Apple apple3 = new Apple("Rubinola", "Red", 5);

        if (apple.getColor() == apple3.getColor()) {
            System.out.println("Same color 1 and 3");
        } else if (apple2.getColor() == apple3.getColor()){
            System.out.println("Same color 2 and 3");
        } else if (apple.getColor() == apple2.getColor()){
            System.out.println("Same color 1 and 2");
        }
        else {
            System.out.println("Diffrent color");
        }
    }
}
