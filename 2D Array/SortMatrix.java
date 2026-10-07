import java.util.Arrays;

public class SortMatrix {

    public static void sortMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] temp = new int[rows * cols];

        // 1. Flatten 2D matrix into 1D array
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                temp[k++] = matrix[i][j];
            }
        }

        // 2. Sort 1D array
        Arrays.sort(temp);

        // 3. Put elements back into 2D matrix
        k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = temp[k++];
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            { 5, 4, 7 },
            { 1, 3, 8 },
            { 2, 9, 6 }
        };

        sortMatrix(matrix);

        System.out.println(Arrays.deepToString(matrix));
        // Output: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    }
}
