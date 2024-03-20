import java.util.Scanner;

public class U1_5_E5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter an integer number: ");
        number = input.nextInt();
        input.close();

        if (number%2 == 0) {
            System.out.print(number + " is an even number.");
        }    
        else {
            System.out.print(number + " is an odd number.");
        }
    }
}