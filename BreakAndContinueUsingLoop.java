public class BreakAndContinueUsingLoop {
    public static void main(String[] args) {
        // break; and continue; using loop.

        for (int i = 0;i < 10;i++){
            System.out.println(i);
            if (i == 2){
                System.out.println("End the Loop!!");
                break;  // It will exit the loop.
            }
        }

        // Printing all multiples of 3 using for loop and continue;.
        System.out.println("Multiple of 3 till 50:");
        for (int i = 1;i < 50;i++){
            if (i % 3 != 0){
                continue;  // It will directly go to the next iteration.
            }
            System.out.println(i);
        }
    }
}