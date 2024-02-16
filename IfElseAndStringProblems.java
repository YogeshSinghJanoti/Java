import java.util.Scanner;
public class IfElseAndStringProblems {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String website;
        System.out.print("Enter website name: ");
        website = S.next();
        if (website.endsWith(".com")){
            System.out.println("It's a Commercial website.");
        } else if (website.endsWith(".org")) {
            System.out.println("It's an Organisation website.");
        }else if (website.endsWith(".in")){
            System.out.println("It's an Indian website.");
        }else {
            System.out.println("It's a random website.");
        }
    }
}