import java.util.Scanner;

public class U2_3_E1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int arraySize;

        System.out.print("How many random numbers would you like to generate?: ");
        arraySize = read.nextInt();

        int [] randomNumbers = new int[arraySize];
        int biggestNum = 0;

        for (int i = 0; i < arraySize; i++) {
            randomNumbers[i] = (int)Math.round(Math.random() * 100);
            System.out.print(randomNumbers[i] + " ");

            
            if (i == 0) {
                biggestNum = randomNumbers[i];
            }
            else if (biggestNum < randomNumbers[i]) {
                biggestNum = randomNumbers[i];
            }
        }
        System.out.println("\nThe biggest number is: " + biggestNum);

        System.out.print("Enter two positions you would like to swap (# #): " );
        int swap1 = read.nextInt();
        int swap2 = read.nextInt();
        read.close();

        int numHolder = randomNumbers[swap1-1];
        randomNumbers[swap1-1] = randomNumbers[swap2-1];
        randomNumbers[swap2-1] = numHolder;

        System.out.println("\nHere is the new array: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(randomNumbers[i] + " ");
        }
    }
}