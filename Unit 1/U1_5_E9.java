import java.util.Scanner;

public class U1_5_E9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;

        System.out.println("Do you want a drink (Y/N)?");
        userInput = input.nextLine();
        input.close();

        if (userInput.equalsIgnoreCase("Y")) {
            System.out.print("Here is your drink.");
        }
        else if (userInput.equalsIgnoreCase("N")) {
            System.out.print("Have a nice day.");
        }
        else {
            System.out.print("Invalid input.");
        }
    }
}