import java.util.Scanner;

public class ArraySortedOrNot {
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

        boolean isSorted = true;  // Let the array is sorted.
        // Checking if the i th element is less than or equal to the i+1 th element.
        for (int i = 0;i < size - 1;i++){
            if (array[i] > array[i + 1]){
                isSorted = false;
                break;
            }
        }

        if (isSorted){
            System.out.println("The array is sorted!!");
        } else {
            System.out.println("The array is unsorted!!");
        }
    }
}