import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainPart3_CollectionUtils {

    public static void main(String[] args) {
        List originalList = Arrays.asList(1, 2, 3, 4, 5, 6);
        List secondList = Arrays.asList(3, 4, 5, 6);
        List<Integer> emptyList = new ArrayList<>();
        List<Integer> filterList = new ArrayList<>(Arrays.asList(3, 4, 6, 8));

        System.out.println("Original list: " + originalList.toString());
        System.out.println("Second list: " + secondList.toString());
        System.out.println("Empty list: " + emptyList.toString());
        System.out.println("Filter list: " + filterList.toString());


        System.out.println("Intersection result: " + CollectionUtils.intersection(originalList, secondList));

        System.out.println("Subtract result: " + CollectionUtils.subtract(originalList, secondList));

        System.out.println("Ignore null: " + CollectionUtils.addIgnoreNull(emptyList, 2));
        System.out.println("Ignore null: " + CollectionUtils.addIgnoreNull(emptyList, null));
        System.out.println("Empty list: " + emptyList.toString());

        System.out.println("Contains any: " + CollectionUtils.containsAny(originalList, emptyList));
        System.out.println("Contains any: " + CollectionUtils.containsAny(secondList, emptyList));

        System.out.println("Contains all: " + CollectionUtils.containsAll(originalList, secondList));
        System.out.println("Contains all: " + CollectionUtils.containsAll(secondList, originalList));

        System.out.println("Is empty: " + CollectionUtils.isEmpty(emptyList));
        emptyList.clear();
        System.out.println("Is empty: " + CollectionUtils.isEmpty(emptyList));

        System.out.println("Is subcollection: " + CollectionUtils.isSubCollection(originalList, secondList));
        System.out.println("Is subcollection: " + CollectionUtils.isSubCollection(secondList, secondList));

        System.out.println("Find: " + CollectionUtils.find(emptyList, new Predicate<Integer>() {
            @Override
            public boolean evaluate(Integer integer) {
                return integer == 10;
            }
        }));
        CollectionUtils.addIgnoreNull(emptyList, 10);
        System.out.println("Find: " + CollectionUtils.find(emptyList, new Predicate<Integer>() {
            @Override
            public boolean evaluate(Integer integer) {
                return integer == 10;
            }
        }));


        System.out.println("Filter list: " + filterList.toString());
        CollectionUtils.filter(filterList, new Predicate<Integer>() {
            @Override
            public boolean evaluate(Integer integer) {
                return integer % 2 == 0;
            }
        });
        System.out.println("Filter list: " + filterList.toString());

        System.out.println("Union List: " + CollectionUtils.union(originalList, secondList));
    }
}
