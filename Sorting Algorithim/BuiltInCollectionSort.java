import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BuiltInCollectionSort {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("Banana", "Apple", "Mango"));

        // Ascending order
        Collections.sort(fruits); 
        // Or using List interface method directly: fruits.sort(null);

        System.out.println(fruits); // [Apple, Banana, Mango]

        // Descending order using collections reverse comparator
        fruits.sort(Collections.reverseOrder());

        System.out.println(fruits); // [Mango, Banana, Apple]
    }
}
