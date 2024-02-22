public class Methods {
    // 'static' keyword is used to call the method without object creation.
    static int add(int x,int y){
        int sum = x + y;
        return sum;
    }
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        int c = add(a,b);

        // Method invocation using object creation.
//        Methods obj = new Methods();
//        int c = obj.add(a,b);

        System.out.println(c);
    }
}