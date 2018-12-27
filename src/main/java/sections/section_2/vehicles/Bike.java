package sections.section_2.vehicles;

import sections.section_2.abstracts.Vehicle;

public class Bike extends Vehicle {

    public boolean hasHandlebar;
    public Bike(double height, double width, double length, double weight, int numberOfWheel, boolean hasHandlebar) {
        super(height, width, length, weight, numberOfWheel);
        this.hasHandlebar = hasHandlebar;
    }

    public boolean isUseful() {
       if (hasHandlebar){
           return true;
       }
       else {
           return false;
       }
    }

}
