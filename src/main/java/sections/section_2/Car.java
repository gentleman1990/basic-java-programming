package sections.section_2;

import sections.section_2.abstracts.Vehicle;

public class Car extends Vehicle {
    private String steeringWheelPosition;

    public Car(double height, double width, double length, double weight, int numberOfWheel, String steeringWheelPosition) {
        super(height, width, length, weight, numberOfWheel);
        this.steeringWheelPosition = steeringWheelPosition;
    }

    public String getSteeringWheelPosition() {
        return steeringWheelPosition;
    }
}
