import java.util.Scanner;

public class U2_1_E1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int userInput;

        System.out.print("Please enter an integer: ");
        userInput = read.nextInt();
        read.close();

        for (int i = 1; i <= userInput; i++) { // loop to go up one until i is greater than or equal to what the user inputted
            System.out.printf(i + " %.2f\n", Math.sqrt(i)); // square roots i and prints it each time
            // %.2f makes it so that it only prints 2 decimal places of the argument
            // \n makes a new line after the print statement so they aren't bunched up together and are actually readable
        }
    }
}