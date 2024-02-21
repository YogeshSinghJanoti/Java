import java.util.Scanner;

public class ReverseAnArray {
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

        // Reversing the array.
        int[] reverseArray = new int[size];
        for (int i = 0;i < size;i++){
            reverseArray[i] = array[size-(i+1)];
        }

        // Array before reversing.
        System.out.print("Array Before:");
        for (int i = 0;i < size;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

        // Array After reversing.
        System.out.print("Array After reversing:");
        for (int i = 0;i < size;i++){
            System.out.print(reverseArray[i]+" ");
        }
    }
}