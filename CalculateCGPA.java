import java.util.Scanner;
// Write a program to calculate CGPA using marks of three subjects.(out of 100)
public class CalculateCGPA {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter marks of subject 1:");
        float sub1 = S.nextFloat();
        System.out.print("Enter marks of subject 2:");
        float sub2 = S.nextFloat();
        System.out.print("Enter marks of subject 3:");
        float sub3 = S.nextFloat();
        float sum = sub1 + sub2 + sub3;
        float CGPA = sum/30;
        System.out.println("The CGPA of the Student is "+CGPA);
    }
}