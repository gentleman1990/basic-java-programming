package sections.section_2.vehicles;

import sections.section_2.abstracts.Vehicle;

public class Airplane extends Vehicle {

    private int numberOfWings;

    private String model;
    private String brand;
    private boolean isStillProduced;

    public Airplane(double height, double width, double length, double weight, int numberOfWheel, int numberOfWings, String model, String brand, boolean isStillProduced) {
        super(height, width, length, weight, numberOfWheel);
        this.numberOfWings = numberOfWings;
        this.model = model;
        this.brand = brand;
        this.isStillProduced = isStillProduced;
    }

    public int getNumberOfWings() {
        return numberOfWings;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isStillProduced() {
        return isStillProduced;
    }

    public boolean isUseful() {
        return true;
    }
}
