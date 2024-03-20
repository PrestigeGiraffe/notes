import java.util.Scanner;

public class U2_2_E4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String userInput;

        System.out.print("Type a word: ");
        userInput = read.nextLine();
        read.close();

        int wordLength = userInput.length();

        for (int i = 0; i < wordLength; i++) {
            String upperCase = userInput.toUpperCase();
            System.out.println(upperCase.charAt(i));
        }
    }
}