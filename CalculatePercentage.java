import java.util.Scanner;
// Write a Java Program to calculate percentage of a given student in CBSE board exam.
// His marks from 5 subjects must be taken as input from the keyboard.(Marks are out of 100.)
public class CalculatePercentage {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter marks of subject 1:");
        float sub1 = S.nextFloat();
        System.out.print("Enter marks of subject 2:");
        float sub2 = S.nextFloat();
        System.out.print("Enter marks of subject 3:");
        float sub3 = S.nextFloat();
        System.out.print("Enter marks of subject 4:");
        float sub4 = S.nextFloat();
        System.out.print("Enter marks of subject 5:");
        float sub5 = S.nextFloat();
        float sum = sub1 + sub2 + sub3 + sub4 + sub5;
        float percentage = sum/5;
        System.out.println("The percentage of the student is:"+percentage);
    }
}