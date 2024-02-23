import java.util.Scanner;

public class ProblemsBasedOnMethods {
    static void table(int num){
        // Print multiplication table of a number n.
        for (int i = 1;i <= 10;i++){
            System.out.printf("%d X %d = %d \n", num , i , num * i);
        }
    }
    static int sumOfNaturalNumbers(int num){
        // To calculate sum of first 'n' natural numbers.
        if (num == 1){
            return 1;
        } else {
            return sumOfNaturalNumbers(num - 1) + num;
        }
    }
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the number:");
        int x = S.nextInt();
        // table(x);
        // System.out.printf("The sum of first %d natural numbers is %d.", x , sumOfNaturalNumbers(x));

    }
}