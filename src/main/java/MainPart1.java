import test.SimpleClass;

public class MainPart1 {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        SimpleClass simpleClass = new SimpleClass(2);

        // public method
        simpleClass.simplePublicMethod();
        System.out.println(simpleClass.simpleReturnTypeMethod());
//        //FOR I LOOP
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//            //IF STATEMENT
//            if (i == 2) {
//                System.out.println("Number 2 reached!");
//            }
//        }
//
//        String name = "something";
//        int number = 0;
//        System.out.println("This is test message: " + name + " and a number: " + number);
//
//        //WHILE LOOP
//        while (number < 2) {
//            System.out.println("Number of while loop: " + number);
//            number++;
//        }
//
//        for (int i = 0; i < 10; i++) {
//            switch (i) {
//                case 0:
//                    System.out.println("Case 0");
//                case 2:
//                    System.out.println("Case 2");
//                case 4:
//                    System.out.println("Case 4");
//                default:
//                    System.out.println("Default");
//            }
//        }
    }
}
