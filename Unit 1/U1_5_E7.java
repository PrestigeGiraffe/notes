import java.util.Scanner;

public class U1_5_E7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Please enter a positive integer: ");
        number = input.nextInt();
        input.close();

        if (number >= 100) {
            System.out.print(number + " has 3 or more digits");
        }
        else if (number >= 10) {
            System.out.print(number + " has 2 digits");
        }
        else {
            System.out.print(number + " has 1 digit");
        }
    }
}