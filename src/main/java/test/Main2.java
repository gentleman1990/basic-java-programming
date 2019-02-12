package test;

public class Main2 {
    public static void main(String[] args) {
        SimpleClass simpleClass = new SimpleClass(2);

        //protected method visible in same package
        simpleClass.simpleProtectedMethod();
        System.out.println(simpleClass.simpleReturnStringTypeMethod());
    }
}
