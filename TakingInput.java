import java.util.Scanner;
public  class TakingInput {
    public static void main(String[] args){
        System.out.println("Taking Input from the user");
        Scanner S = new Scanner(System.in);
//        System.out.print("Enter number:");
//        boolean bool = S.hasNextInt();
//        System.out.println(bool);
//        String str = S.next();// IT TAKES FIRST LETTER ONLY
//        System.out.println(str);
        String str = S.nextLine();// IT TAKES THE COMPLETE LINE
        System.out.println(str);
    }
}