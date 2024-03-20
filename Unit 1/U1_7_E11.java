import java.util.Scanner;

public class U1_7_E11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int userInput, factorialNum;

        System.out.print("Please enter a positive integer: ");
        userInput = read.nextInt();
        read.close();

        factorialNum = userInput;
        for (int i = userInput-1; i>=1; i--) {
            factorialNum *= i;
        }
        System.out.print("!" + userInput + " = " + factorialNum);
    }
}