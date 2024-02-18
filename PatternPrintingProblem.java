import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PatternPrintingProblem {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = S.nextInt();

        for (int i = 0;i <= num;i++){
            for (int j = 0;j < i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}