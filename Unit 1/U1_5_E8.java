import java.util.Scanner;

public class U1_5_E8 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        double number;

        System.out.print("Enter a positive number: ");
        number = input.nextDouble();
        input.close();

        if (number >= 10 && number < 20) {
            System.out.print("Interval 1");
        }
        else if (number > 50 && number < 100) {
            System.out.print("Interval 2");
        }
        else if (number >= 120 && number <= 150) {
            System.out.print("Interval 3");
        }
        else {
            System.out.print("No interval");
        }
    }
}