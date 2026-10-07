import java.util.Arrays;

public class CountingSort {

    public static void countingSort(int[] arr) {
        if (arr.length == 0) return;

        // Step 1: Find the maximum and minimum values in the array
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];

        // Step 2: Store the count of each element
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }

        // Step 3: Modify count array to store cumulative counts (prefix sums)
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Step 4: Build the output array (traverse backwards to preserve stability)
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        // Step 5: Copy output array back to original array
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        System.out.println("Original array: " + Arrays.toString(arr));

        countingSort(arr);

        System.out.println("Sorted array:   " + Arrays.toString(arr));
    }
}
