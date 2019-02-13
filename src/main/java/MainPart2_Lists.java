import goods.fruits.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainPart2_Lists {
    public static void main(String[] args) {
        //List declaration
        ArrayList arrayList;

        //List declaration - empty
        ArrayList arraListWithLength = new ArrayList();

        //List declaration with predefined String values
        List<String> arrayListWithValues = Arrays.asList("value1", "value2", "value3");

        //List declaration with predefined int values
        List<Integer> arrayListWithIntegerValues = Arrays.asList(1, 2, 7, 15, 20, 55);

        //List declaration with predefined object values
        List<Apple> arrayListWithApplceObject = Arrays.asList(new Apple("Jonagold", "Red", 20), new Apple("Smurfs", "Blue", 1));

        //Getting list length
        System.out.println("List length: " + arrayListWithValues.size());
        //Getting list value from array
        System.out.println("Array value from first row: " + arrayListWithValues.get(0));

        //Processing list
        for (int i = 0; i < arrayListWithValues.size(); i++) {
            System.out.println("Iteration: " + i + " and the value is: " + arrayListWithValues.get(i));
        }

        //Processing list with integers
        for (int i = 0; i < arrayListWithIntegerValues.size(); i++) {
            System.out.println("Iteration: " + i + " and the value is: " + arrayListWithIntegerValues.get(i));
        }
        // Summing all elements
        double total = 0;
        for (int i = 0; i < arrayListWithIntegerValues.size(); i++) {
            total += arrayListWithIntegerValues.get(i);
        }
        System.out.println("Total is " + total);

        //Finding the largest element
        double max = arrayListWithIntegerValues.get(0);
        for (int i = 1; i < arrayListWithIntegerValues.size(); i++) {
            if (arrayListWithIntegerValues.get(i) > max)
                max = arrayListWithIntegerValues.get(i);
        }
        System.out.println("Max is " + max);

        //Passing list to method
        listAsAParameter(arrayListWithIntegerValues);

        //Getting list from method
        List returnList = createAndReturnList(10);
        listAsAParameter(returnList);
    }

    private static void listAsAParameter(List list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Value from method body: " + list.get(i).toString());
        }
    }

    private static List createAndReturnList(int predefinedLength){
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            list.add(String.valueOf(i));
        }
        return list;
    }
}
