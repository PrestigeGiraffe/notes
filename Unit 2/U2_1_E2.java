import java.util.Scanner;

public class U2_1_E2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String userIn;
        boolean loop = true;

        // dice variables
        double die1, die2, sum;
        boolean doubles;

        while (loop) {
            System.out.println("\nDie 1; Die 2; Sum; Doubles\n...");
            die1 = Math.round(Math.random() * 6);
            die2 = Math.round(Math.random() * 6);
            sum = die1 + die2;
            if (die1 == die2) {
                doubles = true;
            }
            else {
                doubles = false;
            }

            System.out.printf("%.0f, %.0f, %.0f, %b\n", die1, die2, sum, doubles);


            while (true) {
                System.out.print("Do you want to roll again? (r/s): ");
                userIn = read.nextLine();

                if (userIn.equalsIgnoreCase("r")) {
                    loop = true;
                    System.out.println("------------------------------");
                    break;
                }
                else if (userIn.equalsIgnoreCase("s")) {
                    loop = false;
                    System.out.println("Thank you for playing.");
                    break;
                }
                else {
                    System.out.println("Please enter a valid input");
                }
            }
        }
        read.close();
    }
}