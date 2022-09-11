package Bai_on_tap;

public class bai_9 {
    public static void main(String[] args) {
        int row = 2, column = 3;

        int[][] matrix = { {2, 3, 4}, {5, 6, 4} };
        System.out.printf("Các phần tử trong ma trận: ", row, column);
        print(matrix);
        int[][] transpose = new int[column][row];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.printf("Các phần tử trong ma trận:", row, column);
        print(transpose);
    }
    public static void print(int[][] matrix) {
        for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
