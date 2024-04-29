import java.util.Scanner;

public class U3_1_E3 {
    public static void main(String [] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a color: ");
        String color = read.nextLine();
        read.close();

        sentence(color);
    }

    static void sentence(String color) {
        System.out.printf("The %s apple is delicious.", color);
    }
}