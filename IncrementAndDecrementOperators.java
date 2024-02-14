public class IncrementAndDecrementOperators {
    public static void main(String[] args){
        int a = 27;
        System.out.println(a++);// POST INCREMENT
        System.out.println(a);
        System.out.println(++a);// PRE INCREMENT
        System.out.println(a);

        int b = 16;
        System.out.println(b--);// POST DECREMENT
        System.out.println(b);
        System.out.println(--b);// PRE DECREMENT
        System.out.println(b);

        char ch = 'a';
        System.out.println(++ch);
    }
}