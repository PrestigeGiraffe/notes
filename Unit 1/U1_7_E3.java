import java.util.Scanner;

public class U1_7_E3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = 0, multiples = 0, dividingNum = 0;

        System.out.print("Please enter a number: ");
        num = read.nextInt();
        read.close();

        dividingNum = num;
        while (multiples <= 2 || dividingNum > 1) {
            if (num % dividingNum == 0) {
                multiples++;
                System.out.println("M: " + multiples);
            }
            dividingNum--;
            System.out.println("D: " + dividingNum);
        }

        if (multiples > 2) {
            System.out.print(num + " is not a prime number.");
        }
        else {
            System.out.print(num + "is a prime number");
        }
    }
}