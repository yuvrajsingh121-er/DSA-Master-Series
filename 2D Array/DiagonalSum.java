public class DiagonalSum {

    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            // Add primary diagonal element mat[i][i]
            totalSum += mat[i][i];

            // Add secondary diagonal element mat[i][n - 1 - i]
            // Skip the center element if it was already added by primary diagonal
            if (i != n - 1 - i) {
                totalSum += mat[i][n - 1 - i];
            }
        }

        return totalSum;
    }

    public static void main(String[] args) {
        // Example 1: 3x3 Odd Matrix
        int[][] mat1 = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };

        // Primary: 1 + 5 + 9 = 15
        // Secondary: 3 + 5 + 7 = 15
        // Total (excluding duplicate center '5'): 15 + 15 - 5 = 25
        System.out.println("Diagonal Sum (3x3): " + diagonalSum(mat1)); // Output: 25

        // Example 2: 4x4 Even Matrix
        int[][] mat2 = {
            { 1, 1, 1, 1 },
            { 1, 1, 1, 1 },
            { 1, 1, 1, 1 },
            { 1, 1, 1, 1 }
        };
        System.out.println("Diagonal Sum (4x4): " + diagonalSum(mat2)); // Output: 8
    }
}
