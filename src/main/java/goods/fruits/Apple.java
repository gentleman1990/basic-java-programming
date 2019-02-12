package goods.fruits;

public class Apple {
    //define 3 fields: name, color and the number of pips
    String name;
    String color;
    int numberOfPips;

    //define 1 additional constructor: name, color and the number of pips
    public Apple(String name, String color, int numberOfPips) {
        this.name = name;
        this.color = color;
        this.numberOfPips = numberOfPips;
    }

    //define 3 public methods getName, getColor, gerNumberOfPips
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfPips() {
        return numberOfPips;
    }



}
