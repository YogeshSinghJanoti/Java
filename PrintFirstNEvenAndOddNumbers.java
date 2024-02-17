import java.util.Scanner;

public class PrintFirstNEvenAndOddNumbers {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = S.nextInt();
        // To print first n even numbers.
        System.out.print("First "+n+" even numbers: ");
        for (int i = 0;i < n;i++){
            System.out.print(2*i+" ");
        }
        System.out.println();

        // To print first n odd numbers.
        System.out.print("First "+n+" odd numbers: ");
        for (int i = 0;i < n;i++){
            System.out.print(2*i+1+" ");
        }
    }
}