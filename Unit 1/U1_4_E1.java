import java.util.Scanner;

public class U1_4_E1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, discriminant;
        int numOfSolutions;

        System.out.print("Please enter the A, B, and C values of your parabola\nA: ");
        a = input.nextDouble();
        System.out.print("B: ");
        b = input.nextDouble();
        System.out.print("C: ");
        c = input.nextDouble();
        input.close();

        discriminant = (b*b) - (4*a*c);

        if (discriminant > 0){
            numOfSolutions = 2;
        }
        else if (discriminant == 0){
            numOfSolutions = 1;
        }
        else{
            numOfSolutions = 0;
        }

        System.out.print("There are " + numOfSolutions + " real solution(s)");
    }
}