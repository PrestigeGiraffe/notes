import java.util.Scanner;

public class U2_2_E3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String userIn;

        System.out.print("Type a word: ");
        userIn = read.nextLine();
        read.close();
        int wordLength = userIn.length();

        for(int i = 0; i<wordLength; i++) {
            char currentCharacter = userIn.charAt(i);
            
            if (currentCharacter >= 'A' && currentCharacter <= 'Z') {
                System.out.print(String.valueOf(currentCharacter).toLowerCase());
            }
            else {
                System.out.print(String.valueOf(currentCharacter).toUpperCase());
            }
        }
    }
}