import  java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        /* String is a class but can be used as a data type.
        Strings are immutable and cannot be changed.*/

        //String name = new String("yogesh");
        //String name = "yogesh";
        //System.out.println(name);

        Scanner S = new Scanner(System.in);
        //System.out.print("ENTER: ");
        //String st = S.next();  // TAKES FIRST WORD ONLY
        //System.out.println(st);
        System.out.print("ENTER: ");
        String St = S.nextLine();  // TAKES COMPLETE LINE
        System.out.println(St);
    }
}