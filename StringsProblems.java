public class StringsProblems {
    public static void main(String[] args) {
        // Problem 1: To replace spaces with underscores.
        String text = "Have a Good Day!";
        text = text.replace(" ","_");
        System.out.println(text);

        // Problem 2: To detect double and triple spaces in a String.
        String myString = "This string contain double  and triple   spaces.";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Problem 3: Write a program to format the following letter using Escape Sequence Characters.
        // letter = "Hello, I play better Chess than you! Thanks!"
        String myLetter = "Hello, \n \t I play better Chess than you! \n\t Thanks!";
        System.out.println(myLetter);
    }
}