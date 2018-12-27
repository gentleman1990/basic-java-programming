package sections.section_2.services.impl;

import sections.section_2.vehicles.Airplane;
import sections.section_2.services.Workshop;

public class AirplaneWorkshop implements Workshop {

    Airplane airplane;

    public AirplaneWorkshop(Airplane airplane) {
        this.airplane = airplane;
    }

    public double calculateRepairPrice() {
        return airplane.getHeight() * 0.2 * airplane.getWidth() * 0.1 * airplane.getLength() * 0.1;
    }

    public double getPriceForChangingWheel() {
        return calculateRepairPrice() / airplane.getNumberOfWheel();
    }

    public void checkVehicleDimensions() {
        System.out.println(String.format("Airplane dimensions: height - %s, width - %s, length - %s", airplane.getHeight(), airplane.getWidth(), airplane.getLength()));
    }
}
