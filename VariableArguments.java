public class VariableArguments {
    static int add(int a,int b){
        return a + b;
    }
    static int add(int a,int b,int c){
        return a + b + c;
    }
    /*If you want to call the method for variable numbers of arguments
    (i.e. you don't know how many numbers you will pass in the method).*/
    static int add(int ...arr){
        // Available as int[] arr;
        int result = 0;
        for (int a : arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 4 and 5 is " +add(4,5));
        System.out.println("The sum of 4, 3 and 5 is " +add(4,3,5));
        System.out.println("The sum of 2, 4, 3 and 5 is " +add(2,4,3,5));
        System.out.println("The sum of 1, 2, 3, 4 and 5 is " +add(1,2,3,4,5));
    }
}