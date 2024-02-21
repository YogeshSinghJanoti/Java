import java.util.Scanner;

public class AdditionOfTwoMatrix {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the no. of rows in matrix: ");
        int rows = S.nextInt();
        System.out.print("Enter the no. of columns in matrix: ");
        int columns = S.nextInt();
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] result = new int[rows][columns];

        // Taking elements in the fist matrix from the user.
        for (int i = 0;i < rows;i++){
            for (int j = 0;j < columns;j++){
                System.out.println("Enter Element of matrix1:");
                matrix1[i][j] = S.nextInt();
            }
        }

        // Taking elements in the second matrix from the user.
        for (int i = 0;i < rows;i++){
            for (int j = 0;j < columns;j++){
                System.out.println("Enter Element of matrix2:");
                matrix2[i][j] = S.nextInt();
            }
        }

        // Adding the matrices.
        for (int i = 0;i < matrix1.length;i++){
            for (int j = 0;j < matrix1[i].length;j++){
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Printing the resulting matrix.
        for (int[] item1 : result) {
            for (int item2 : item1) {
                System.out.print(item2 + " ");
            }
            System.out.println();
        }
    }
}