public class ArraysProperties {
    public static void main(String[] args) {
        // Making an String Array.
        String[] Students = {"Yogesh","Sumit","Ritik","Yashasvi","Vikas"};
        System.out.println(Students.length);  // Total Elements in the Students Array.

        // Displaying the Array Elements.
        for (int  i = 0;i < Students.length;i++){
            System.out.println(Students[i]);
        }

        // Displaying the Array Elements in reverse order.
        for (int i = Students.length - 1;i > 0;i--){
            System.out.println(Students[i]);
        }
    }
}