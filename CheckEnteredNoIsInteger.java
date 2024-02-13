import java.util.Scanner;
public class CheckEnteredNoIsInteger {
    public static  void main(String[] args){
        System.out.print("Enter a number:");
        Scanner S = new Scanner(System.in);
        boolean bool = S.hasNextInt();
        System.out.println(bool);
    }
}