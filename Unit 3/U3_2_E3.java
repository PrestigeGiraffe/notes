import java.util.Scanner;

public class U3_2_E3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double largestNum;
        int arraySize;
        System.out.print("How many numbers would you like to enter?: ");
        arraySize = read.nextInt();
        double[] numbers = new double[arraySize];
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = read.nextDouble();
        }
        read.close();

        largestNum = calcLargest(numbers);
        System.out.printf("The largest number is %.1f", largestNum);
    }

    static double calcLargest(double[] numbers) {
        double largestNum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largestNum) {
                largestNum = numbers[i];
            }
        }

        return largestNum;
    }
}