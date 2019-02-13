public class MainPart2_Arrays {
    public static void main(String[] args) {

        //Array declaration
        String[] emptyArray;

        //Array declaration with predefined length
        String[] arrayWithLength = new String[10];

        //Array declaration with predefined String values
        String[] arrayWithValues = {"value", "value2", "value3", "value4"};

        //Array declaration with predefined int values
        int[] arrayWithIntValues = {2, 16, 7, 14, 22, 15, 4};

        //Multidimensional arrays
        //first [] - rows, second [] - columns
        int[][] emptyMultidimensionalArray;
        int[][] multidimensionalArray = new int[2][5];
        int[][] multidimensionalArrayWithValues = {{11,12},{21,22},{31,32}};

//        /**Compilation error - operation not allowed
//         * emptyArray[0];
//         * System.out.println(emptyArray[0]);
//         */
//
//        //Getting array length
//        System.out.println("Array length: " + arrayWithLength.length);
//        //Getting array value from array
//        System.out.println("Array value from first row: " + arrayWithLength[0]);
//
//        //Processing array
//        for (int i = 0; i < arrayWithValues.length; i++) {
//            System.out.println("Iteration: " + i + " and the value is: " + arrayWithValues[i]);
//        }
//
//        //Processing array with integers
//        for (int i = 0; i < arrayWithIntValues.length; i++) {
//            System.out.println("Iteration: " + i + " and the value is: " + arrayWithIntValues[i]);
//        }
//        // Summing all elements
//        double total = 0;
//        for (int i = 0; i < arrayWithIntValues.length; i++) {
//            total += arrayWithIntValues[i];
//        }
//        System.out.println("Total is " + total);
//
//        //Finding the largest element
//        double max = arrayWithIntValues[0];
//        for (int i = 1; i < arrayWithIntValues.length; i++) {
//            if (arrayWithIntValues[i] > max) max = arrayWithIntValues[i];
//        }
//        System.out.println("Max is " + max);
//
//        //Passing array to method
//        arrayAsAParameter(arrayWithIntValues);
//
//        //Getting array from method
//        int[] returnArray = createAndReturnArray(10);
//        arrayAsAParameter(returnArray);
//
//        //Processing multidimensional array
//        for (int i = 0; i < multidimensionalArrayWithValues.length; i++) {
//            for (int j = 0; j < multidimensionalArrayWithValues[i].length; j++) {
//                System.out.println("[" + i +  "]"  + "[" + j +  "] = " + multidimensionalArrayWithValues[i][j]);
//            }
//        }
    }

    private static void arrayAsAParameter(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Value from method body: " + array[i]);
        }
    }

    private static int[] createAndReturnArray(int predefinedLength){
        int[] array = new int[predefinedLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }
}
