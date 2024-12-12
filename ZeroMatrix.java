import java.util.Arrays;

public class ZeroMatrix {
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] rowZero = new boolean[m];
        boolean[] colZero = new boolean[n];

        // Step 1: Identify the rows and columns that need to be zeroed
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }

        // Step 2: Set the rows to zero
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rowZero[i] || colZero[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };
        setZeroes(matrix);
        // Print the matrix
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
