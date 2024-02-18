import java.util.Scanner;

public class TableOfAnyNumber {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = S.nextInt();

        int i = 1;
        while (i <= 10){
            System.out.printf("%d * %d = %d \n",num,i,num * i);
            i++;
        }
    }
}