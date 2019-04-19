package construction.statics;

public class ExampleClass {
    private static String msg = "MSGstatic";
    private String msgNonStatic = "NonStaticMSG";

    // Static nested class
    public static class NestedStaticClass {
        public void printMessage() {
            System.out.println("Message from nested static class: " + msg);
            //System.out.println(msgNonStatic);
        }
    }

    // non-static nested class - also called Inner class
    public class InnerClass {
        public void display() {
            System.out.println("Message from non-static nested class: " + msg);
            System.out.println(msgNonStatic);
        }
    }
}
