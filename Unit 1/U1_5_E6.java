import java.util.Scanner;

public class U1_5_E6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("Please enter 2 numbers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        input.close();

        if (num1 % num2 == 0) {
            System.out.print(num1 + " is a multiple of " + num2);
        }
        else {
            System.out.print(num1 + " is not a multiple of " + num2);
        }
    }
}