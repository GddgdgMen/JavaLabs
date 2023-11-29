import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab2 {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 8, 2, -1},
                {4, 9, 7, 3},
                {8, -5, 2, 10},
                {7, 3, 4}
        };
        int[][] matrix2 = {
                {1, 8},
                {7, 9, 3},
                {5, 6, 2}
        };
        int col1 = matrix1.length;
        int col2 = matrix2.length;

        int row1 = matrix1[0].length;
        int row2 = matrix2[0].length;
        int tempRows;

        for (int i = 0; i < col1; i++) {
            tempRows = matrix1[i].length;
            if (tempRows > row1) {
                row1 = tempRows;
            }
        }
        for (int i = 0; i < col2; i++) {
            tempRows = matrix2[i].length;
            if (tempRows > row2) {
                row2 = tempRows;
            }
        }
        final int col3 = col1 + col2;
        final int row3 = row1 + row2;

        int[][] matrix3 = new int[col3][row3];
        for (int i = 0; i < col1; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix3[i][j] = matrix1[i][j];
            }
        }
        for (int i = 0; i < col2; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix3[i + col1][j + row1] = matrix2[i][j];
            }
        }

        for (int i = 0; i < col3; i++) {
            for (int j = 0; j < row3; j++) {
                System.out.print(matrix3[i][j] + "\t");
            }
            System.out.println();
        }
        int[] maxValues = maxAndMin(matrix3);
        System.out.println(Arrays.toString(maxValues));
    }

    public static int[] maxAndMin(int[][] matrix) {
        int[] out = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 0) {
                    min = Math.min(min, matrix[i][j]);
                    out[i] = min;
                } else {
                    max = Math.max(max, matrix[i][j]);
                    out[i] = max;
                }
            }
        }
        return out;
    }
}
