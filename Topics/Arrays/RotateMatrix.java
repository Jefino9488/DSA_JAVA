package Arrays;

public class RotateMatrix {
    public static int[][] rotateMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] newMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.arraycopy(matrix[i], 0, newMatrix[i], 0, n);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                newMatrix[m - 1 - i][n - 1 - j] = matrix[i][j];
            }
        }
        return newMatrix;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] newMatrix = rotateMatrix(matrix);
        for (int[] ints : newMatrix) {
            for (int j = 0; j < newMatrix[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
