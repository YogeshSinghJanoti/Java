public class PrintingAlphabetUsingForLoop {
    public static void main(String[] args){

        // LOWER CASE ALPHABET
        int ch = 'a';
        for(int i = 0; i < 26; i++){
            char cha = (char)ch;// TYPECASTING
            System.out.println(cha);
            ch++;
        }

        // UPPER CASE ALPHABET
        int Ch = 'A';
        for(int i = 0; i < 26; i++) {
            char Cha = (char) Ch;// TYPECASTING
            System.out.println(Cha);
            Ch++;
        }
    }
}