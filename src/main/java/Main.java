import test.SimpleClass;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        SimpleClass simpleClass = new SimpleClass(2);

        // public method
        simpleClass.simplePublicMethod();
        System.out.println(simpleClass.simpleReturnTypeMethod());
    }
}
