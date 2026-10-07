import java.util.Arrays;

public class BuiltInSort {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9};

        // Sort primitive array in ascending order
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers)); // [1, 2, 5, 8, 9]
    }
}
