import sections.section_1.Airplane;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Airplane airplane = new Airplane();

        Airplane airplaneWithValues = new Airplane((byte) 0x04, (short) 2, 115000, 7700, 16.08F, 54, '\u0043', true, "Airbus", "A300");

        System.out.println(airplane.getModel());
        System.out.println(airplaneWithValues.getModel());
    }
}
