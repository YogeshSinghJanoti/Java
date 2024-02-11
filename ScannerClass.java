import java.util.Scanner;
public  class ScannerClass {
    public static void main(String[] args){
        System.out.println("Taking Input from the user");
        Scanner S = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        //int num1 = S.nextInt();
        float num1 = S.nextFloat();
        System.out.println("Enter number 2 :");
        //int num2 = S.nextInt();
        float num2 = S.nextFloat();
        //int sum = num1 + num2;
        float sum = num1 + num2;
        System.out.println("The sum of these number is "+sum);
    }
}