import java.util.Scanner;
public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int year;
        System.out.print("Enter the year: ");
        year = S.nextInt();

        if (((year % 4 == 0) && (year % 100 == 0 && year % 400 == 0)) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("The year " + year + " is a leap year.");
        }else {
            System.out.println("The year " + year + " is not a leap year.");
        }
    }
}