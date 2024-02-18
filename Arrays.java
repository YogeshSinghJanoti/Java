public class Arrays {
    public static void main(String[] args) {
        // There is zero-based indexing in arrays.

        // Array Declaration And Memory Allocation.
        int[] array = new int[5];  // Array of 5 integers.
        array[0] = 50;
        array[1] = 90;
        array[2] = 88;
        array[3] = 92;
        array[4] = 96;
        //int[] array = {50,90,88,92,96}  // The above array initialization can be done in this way also.

        System.out.println(array[3]); // Print number at index 3.
    }
}