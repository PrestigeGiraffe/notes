import java.util.Scanner;

public class U1_7_E2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double num = 1, sum = 0;
        
        while (num != 0) {
            System.out.print("Please enter a positive number (Enter 0 to stop): ");
            num = read.nextDouble();
            sum += num;
        }
        System.out.println("Sum: " + sum);
        read.close();
    }
}