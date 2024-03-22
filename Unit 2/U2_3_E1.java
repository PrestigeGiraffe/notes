import java.util.Scanner;

public class U2_3_E1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int arraySize;

        System.out.print("How many random numbers would you like to generate?: ");
        arraySize = read.nextInt();
        read.close();

        int [] randomNumbers = new int[arraySize];
        int biggestNum = 0;

        for (int i = 0; i < arraySize; i++) {
            randomNumbers[i] = (int)Math.round(Math.random() * 100);
            System.out.print(randomNumbers[i] + " ");

            if (i != 0 && randomNumbers[i] > randomNumbers[i - 1]) {
                biggestNum = randomNumbers[i];
            }
        }
        System.out.println("\nThe biggest number is: " + biggestNum);
    }
}