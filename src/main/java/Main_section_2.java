import sections.section_2.services.impl.AirplaneWorkshop;
import sections.section_2.vehicles.Airplane;

public class Main_section_2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(100,200,300,500,3,2, "Airbus", "300", true);
        AirplaneWorkshop airplaneWorkshop = new AirplaneWorkshop(airplane);

        System.out.println("Repair costs: " + airplaneWorkshop.calculateRepairPrice() + " zł");
        System.out.println("Changing wheel costs: " + airplaneWorkshop.getPriceForChangingWheel() + " zł");
        airplaneWorkshop.checkVehicleDimensions();
    }
}
