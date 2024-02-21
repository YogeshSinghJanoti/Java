import java.util.Scanner;

public class MaximumElementInArray {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int size = S.nextInt();
        int[] array = new int[size];

        // Taking elements of the array from the user.
        System.out.println("Enter elements in the array:");
        for (int i = 0;i < size;i++){
            array[i] = S.nextInt();
        }

        int maxElement = array[0];  // Let the maximum element be at index 0;
        int maxIndex = 0;

        // Comparing all the elements using for loop.
        for (int i = 0;i < size;i++){
            if (maxElement <= array[i]){
                maxElement = array[i];
                maxIndex = i;
            }
        }
        System.out.println("The maximum element in the array is "+maxElement+" at index "+maxIndex);
    }
}