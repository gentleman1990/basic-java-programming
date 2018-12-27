package sections.section_2.vehicles;

import sections.section_2.abstracts.Vehicle;

public class Car extends Vehicle {
    private SteeringWheelPosition steeringWheelPosition;

    public Car(double height, double width, double length, double weight, int numberOfWheel, SteeringWheelPosition steeringWheelPosition) {
        super(height, width, length, weight, numberOfWheel);
        this.steeringWheelPosition = steeringWheelPosition;
    }

    public SteeringWheelPosition getSteeringWheelPosition() {
        return steeringWheelPosition;
    }

    public boolean isUseful() {
        return false;
    }

    public enum SteeringWheelPosition {
        LEFT,
        RIGHT;
    }
}
