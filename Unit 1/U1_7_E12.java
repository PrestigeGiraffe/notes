import java.util.Scanner;

public class U1_7_E12 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numerator, denominator, simpNum = 0, simpDenom = 0;

        System.out.print("Please enter the numerator and denominator of a fraction:\nNumerator: ");
        numerator = read.nextInt();
        System.out.print("Denominator: ");
        denominator = read.nextInt();
        read.close();

        for (int i = denominator; i >= 1; i--) {
            if (numerator % i == 0 && denominator % i == 0) {
                simpNum = numerator / i;
                simpDenom = denominator / i;
                break;
            }
        }

        System.out.print(numerator + "/" + denominator + " = " + simpNum + "/" + simpDenom);
    }
}