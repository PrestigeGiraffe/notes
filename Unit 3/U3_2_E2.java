import java.util.Scanner;

public class U3_2_E2 {
    public static void main(String [] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Please enter a word: ");
        String word = read.nextLine();
        String reversedWord = reverse(word);
        read.close();

        System.out.printf("%s reversed is %s\n", word, reversedWord);

        if (isPalindrome(word, reversedWord)) {
            System.out.printf("%s is a palindrome.", word);
        }
        else {
            System.out.printf("%s is not a palindrome.", word);
        }
    }

    static String reverse(String word) {
        String reversedWord = "";
        for (int i = word.length()-1; i >= 0; i--){ 
            reversedWord += word.charAt(i);
        }
        
        return reversedWord;
    }

    static boolean isPalindrome(String word, String reversedWord) {
        if (word.equalsIgnoreCase(reversedWord)) {
            return true;
        }
        else {
            return false;
        }
    }
}