import java.util.Scanner;

public class U2_3_E2 {
    public static void main(String[] args) {
        // variables
        Scanner read = new Scanner(System.in);
        int[] frequency = new int[6]; // array that will store how many times each value was rolled
        int rolls;

        // prompting user
        System.out.print("How many times would you like to roll?: ");
        rolls = read.nextInt();
        read.close();

        for (int i = 0; i < rolls; i++) {
            int value = (int)(Math.ceil(Math.random()*6)); // generates random integer number from 1-6
            frequency[value-1]++; // adds one to the frequency of the corresponding index of the generated number
        }

        // output results
        System.out.printf("\nValue    %5s%5s%5s%5s%5s%5s\n", "1", "2", "3", "4", "5", "6"); // prints a heading of each possible value from the dice
        System.out.printf("Frequency%5d%5d%5d%5d%5d%5d", frequency[0], frequency[1], frequency[2], frequency[3], frequency[4], frequency[5]); // prints the frequency of a value under its heading
    }
}