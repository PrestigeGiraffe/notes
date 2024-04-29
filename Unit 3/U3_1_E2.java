import java.util.Scanner;

public class U3_1_E2 {
    static int[] array = new int[10];

    public static void main(String [] args) {
        Scanner read = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nChoose an option:\n1) Generate 10 random numbers [1, 100]\n2) Display the array of numbers\n3) Quit");
            int choice = read.nextInt();
    
            if (choice == 1) {
                array = generateNumbers();
                System.out.println("Successfully generated 10 random numbers.");
            }
            else if (choice == 2) {
                displayNumbers();
            }
            else if (choice == 3) {
                running = false;
                break;
            }
            else {
                System.out.println("Please select a valid option");
            }
        } 

        read.close();
    }

    static int[] generateNumbers() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)Math.round(Math.random()*100);
        }

        return array;
    }

    static void displayNumbers()  {
        for (int i: array) {
            System.out.printf("%d ", i);
        }
    }
}