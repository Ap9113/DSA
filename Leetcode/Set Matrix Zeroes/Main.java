import java.util.*;

public class Main {

    public static void setZeroesBrute(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int[] rows = new int[m];
        int[] cols = new int[n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (matrix[i][j] == 0){
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (rows[i] ==1 || cols[j] ==1)
                    matrix[i][j] = 0;
            }
        }
    }

    public static void setZeroesOptimal(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        boolean firstRowZero = false;
        boolean firstColZero = false;
        for (int j = 0; j < n; j++){
            if (matrix[0][j] == 0){
                firstRowZero = true;
                break;
            }
        }
        for (int i = 0; i < m; i++){
            if (matrix[i][0] == 0){
                firstColZero = true;
                break;
            }
        }
        for (int i = 1; i < m; i++){
            for (int j = 1; j < n; j++){
                if (matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < m; i++){
            for (int j = 1; j < n; j++){
                if (matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if (firstRowZero){
            for (int j = 0; j < n; j++){
                matrix[0][j] = 0;
            }
        }
        if (firstColZero){
            for (int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }
    }
    public static void main(String[] args) {
        // int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int m = matrix.length;
        int n = matrix[0].length;
        // setZeroesBrute(matrix);
        setZeroesOptimal(matrix);
         for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

}
