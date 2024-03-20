import java.util.Scanner;

public class U2_1_E1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int userInput;

        System.out.print("Please enter an integer: ");
        userInput = read.nextInt();
        read.close();

        for (int i = 1; i <= userInput; i++) {
            System.out.printf(i + " %.2f\n", Math.sqrt(i));
        }
    }
}