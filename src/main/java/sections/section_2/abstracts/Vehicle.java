package sections.section_2.abstracts;

public abstract class Vehicle {
    double height;
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

    double getHeight() {
        return height;
    }

    double getWidth() {
        return width;
    }

    double getLength() {
        return length;
    }

    double getWeight() {
        return weight;
    }

    double getNumberOfWheel() {
        return numberOfWheel;
    }
}
