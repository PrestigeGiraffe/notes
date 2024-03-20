public class U2_2_E2 {
    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i<26; i++) { // ASCII values of the alphabet
            String lowercaseAlphabet = alphabet.toLowerCase();
            char lowerCaseLetter = lowercaseAlphabet.charAt(i);
            System.out.print(lowerCaseLetter);  
        }
    }
}