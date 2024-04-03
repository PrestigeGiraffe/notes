import java.util.Scanner;

public class U2_4_E3 {
    public static void main(String[] args) {
        // declaring variables
        int[][] dice = new int[7][7];
        Scanner read = new Scanner(System.in);
        int sum;

        // loop to create array of dice and sums
        for (int i = 0; i < 7; i++) { // 7 iterations instead of 6 for the first column of just the dice numbers
            for (int x = 0; x < 7;  x++) { // 7 iterations for the same reason
                dice[i][x] = i + x; // sets each corresponding dice combination to the sum of them
                System.out.printf("%3d", dice[i][x]);
            }
            System.out.println(); // prints a new line after each row
        }

        System.out.print("Enter a sum: ");
        sum = read.nextInt();
        read.close();

        System.out.printf("To get a sum of %d you can roll: ", sum);
        for (int x = 0; x < dice.length; x++) { // loops through each array of dice
            for (int y = 0; y < dice[x].length; y++) { // loops through each value of each array in dice
                if (dice[x][y] == sum && x != 0 && y != 0) {
                    System.out.printf("(%d, %d) ", x, y); // print the dice values that add to that sum
                }
            }
        }
    }
}