public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            // Prevents potential integer overflow compared to (low + high) / 2
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // Target found, return index
            } else if (arr[mid] < target) {
                low = mid + 1; // Target lies in the right half
            } else {
                high = mid - 1; // Target lies in the left half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in array.");
        }
    }
}
