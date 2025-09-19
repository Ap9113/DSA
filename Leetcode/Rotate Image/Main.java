
public class Main {

    public static void rotateBrute(int[][] matrix){
        int n = matrix.length;
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = rotated[i][j];
            }
        }
    }

    public static void rotateOptimal(int[][] matrix) {
        int n = matrix.length;
        // Step 1: Calculate the transpose of the matrix
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Step 2: Reverse each row
        for (int i = 0; i < n; i++){
            int left = 0, right = n - 1;
            while (left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

        rotateOptimal(matrix);

        // Print the rotated matrix
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

}
