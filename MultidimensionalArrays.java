public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] matrix = new int [2][3];
        matrix[0][0] = 12;
        matrix[0][1] = 14;
        matrix[0][2] = 25;
        matrix[1][0] = 16;
        matrix[1][1] = 15;
        matrix[1][2] = 20;

        // Displaying the 2D-Array using for loop.
        System.out.println("Printing the 2D-Array matrix:");
        for (int i = 0;i < matrix.length;i++){
            for (int j = 0;j < matrix[i].length;j++){
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}