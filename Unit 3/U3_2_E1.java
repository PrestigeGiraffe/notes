import java.util.Scanner;

public class U3_2_E1 {
    public static void main(String [] args) {
        Scanner read = new Scanner(System.in);
        int num1, num2, sum;

        System.out.println("Please enter 2 numbers to add:");
        num1 = read.nextInt();
        num2 = read.nextInt();
        read.close();

        sum = addNumbers(num1, num2);
        System.out.println("The sum is: " + sum);
    }

    static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }
}