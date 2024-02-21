import java.util.Scanner;

public class MinimumElementInArray {
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

        int minElement = array[0];  // Let the minimum element be at index 0;
        int minIndex = 0;

        // Comparing all the elements using for loop.
        for (int i = 0;i < size;i++){
            if (minElement >= array[i]){
                minElement = array[i];
                minIndex = i;
            }
        }
        System.out.println("The minimum element in the array is "+minElement+" at index "+minIndex);
    }
}