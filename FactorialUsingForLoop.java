import  java.util.Scanner;

public class FactorialUsingForLoop {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = S.nextInt();
        int factorial = 1;

        for (int i = 1;i <= num;i++){
            factorial *= i;
        }
        System.out.println("The Factorial of "+num+" is "+factorial+".");
    }
}