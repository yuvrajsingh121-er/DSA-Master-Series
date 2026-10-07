import java.util.Arrays;

public class SquareMatrixTranspose {

    public static void transpose(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap matrix[i][j] and matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };

        transpose(matrix);

        System.out.println(Arrays.deepToString(matrix));
        // Output: [[1, 4, 7], [2, 5, 8], [3, 6, 9]]
    }
}
