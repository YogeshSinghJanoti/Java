public class MethodOverloading {
    static void function(){
        System.out.println("I Love You!!");
    }
    static void function(int a){
        System.out.println("Hello!! I am number "+a);
    }
    static void function(int a,int b){
        System.out.println("My range is from "+a+" to "+b);
    }
    public static void main(String[] args) {
        /* Method Overloading -->> Two or more methods may have the same name if they differ in parameters
        (different number of parameters, different types of parameters, or both).*/
        function();
        function(7);
        function(1,100);
    }
}