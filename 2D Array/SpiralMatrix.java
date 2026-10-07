import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return result;

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // 1. Traverse Right across the top row
            for (int col = left; col <= right; col++) {
                result.add(matrix[top][col]);
            }
            top++;

            // 2. Traverse Down the rightmost column
            for (int row = top; row <= bottom; row++) {
                result.add(matrix[row][right]);
            }
            right--;

            // 3. Traverse Left across the bottom row (if row remains)
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    result.add(matrix[top][col] != 0 ? matrix[bottom][col] : matrix[bottom][col]);
                    // matrix[bottom][col]
                }
                bottom--;
            }

            // 4. Traverse Up the leftmost column (if column remains)
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    result.add(matrix[row][left]);
                }
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            { 1,  2,  3,  4 },
            { 5,  6,  7,  8 },
            { 9, 10, 11, 12 }
        };

        System.out.println("Spiral Order: " + spiralOrder(matrix));
        // Output: [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
    }
}
