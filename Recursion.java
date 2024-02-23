public class Recursion {
    // Factorial of a number by recursion.
    static  int factorial(int num){
        if (num == 1 || num == 0){
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
    // Fibonacci of a number by recursion.
    public static int fibonacci(int num){
        if (num == 0){
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
    public static void main(String[] args) {
        System.out.println("The factorial of 5 is "+factorial(5));
        System.out.print("The fibonacci of 7 is ");
        for (int i = 0;i < 7;i++){
            System.out.print(fibonacci(i)+",");
        }
    }
}