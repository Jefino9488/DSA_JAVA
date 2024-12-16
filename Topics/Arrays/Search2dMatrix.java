package Arrays;

public class Search2dMatrix {
    public static int search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("["+i + "," + j +"] found");
                    return target;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 8, 6},
                {7, 5, 9}
        };
        System.out.println(search(matrix, 5));
    }
}
