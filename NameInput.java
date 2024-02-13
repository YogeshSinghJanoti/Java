import java.util.Scanner;
// Write a Java program which asks the user to enter his/her name
// and greets them with "Hello <name>,have a good day" text.
public class NameInput {
    public static void main(String[] args){
        System.out.println("What is your name?");
        Scanner S = new Scanner(System.in);
        String name = S.next();
        System.out.println("Hello "+name+" have a good day!");
    }
}