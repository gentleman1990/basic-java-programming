import inheritance.Animal;
import inheritance.Dog;
import inheritance.Mammal;
import inheritance.Reptile;
import polymorphism.Employee;
import polymorphism.Salary;

public class MainPart2_Inh_Poly {
    public static void main(String args[]) {

        //Inheritance
        Animal a = new Animal();
        Mammal m = new Mammal();
        Dog d = new Dog();
        Reptile r = new Reptile();

        System.out.println(m instanceof Animal);
        System.out.println(d instanceof Mammal);
        System.out.println(d instanceof Animal);
        System.out.println(d instanceof Animal);
        //System.out.println(r instanceof Mammal);

        //Polymorphism

        Salary s = new Salary("Adam Głowacki", "PL", 4, 2000.00);
        Employee e = new Salary("Jacek Malicki", "PL", 2, 2800.00);
        //Salary s2 = (Salary) new Employee("Jan", "Kowalsku", 1);

        System.out.println("Call mailCheck using Salary reference");
        s.mailCheck();
        System.out.println("\nCall mailCheck using Employee reference");
        e.mailCheck();
        //System.out.println("\nCall mailCheck using s2 reference");
        //s2.getName();
    }

}
