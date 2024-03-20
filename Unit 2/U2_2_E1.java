import java.util.Scanner;

public class U2_2_E1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String equation;

        System.out.print("Please enter an addition equation (e.g. 1+1): ");
        equation = read.nextLine();
        read.close();

        int sign = equation.indexOf('+');
        int num1 = Integer.parseInt(equation.charAt(sign - 1));
        int num2 = (int)equation.charAt(sign + 1);
        System.out.print(sign);
        int answer = num1 + num2;
        System.out.println(answer);
    }
}                                                                                  