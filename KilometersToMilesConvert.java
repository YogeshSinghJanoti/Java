import java.util.Scanner;
public class KilometersToMilesConvert {
    public static void main(String[] args){
        System.out.print("Enter value in KILOMETERS:");
        Scanner S = new Scanner(System.in);
        float km = S.nextFloat();
        double miles = km * 0.621371;
        System.out.println("There are "+ miles +" miles in "+ km +" kilometer.");
    }
}