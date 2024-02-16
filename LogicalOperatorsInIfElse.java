public class LogicalOperatorsInIfElse {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // For Logical AND
        if (a && b){
            System.out.println("YES!!");
        }else {
            System.out.println("NO!!");
        }

        // For Logical OR
        if (a || b){
            System.out.println("Yes!!");
        }else {
            System.out.println("NO!!");
        }

        // For Logical NOT
        System.out.print("NOT of a is: ");
        System.out.println(!a);
        System.out.print("NOT of b is: ");
        System.out.println(!b);

    }
}