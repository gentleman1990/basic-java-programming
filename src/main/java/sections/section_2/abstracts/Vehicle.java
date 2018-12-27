package sections.section_2.abstracts;

public abstract class Vehicle {
    private double height;
    private double width;
    private double length;
    private double weight;
    private int numberOfWheel;

    public Vehicle(double height, double width, double length, double weight, int numberOfWheel) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.weight = weight;
        this.numberOfWheel = numberOfWheel;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }

    public double getNumberOfWheel() {
        return numberOfWheel;
    }

    public abstract boolean isUseful();
}
