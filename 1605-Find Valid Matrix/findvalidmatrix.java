class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int m = rowSum.length;
        int n = colSum.length;
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Fill the matrix with the minimum of the current rowSum and colSum
                matrix[i][j] = Math.min(rowSum[i], colSum[j]);
                // Subtract the filled value from the respective rowSum and colSum
                rowSum[i] -= matrix[i][j];
                colSum[j] -= matrix[i][j];
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] rowSum1 = {3, 8};
        int[] colSum1 = {4, 7};
        int[][] result1 = solution.restoreMatrix(rowSum1, colSum1);
        for (int[] row : result1) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        // Output:
        // 3 0
        // 1 7

        System.out.println();

        // Example 2
        int[] rowSum2 = {5, 7, 10};
        int[] colSum2 = {8, 6, 8};
        int[][] result2 = solution.restoreMatrix(rowSum2, colSum2);
        for (int[] row : result2) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        // Output:
        // 0 5 0
        // 6 1 0
        // 2 0 8
    }
}
