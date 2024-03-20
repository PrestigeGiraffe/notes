import java.util.Scanner;

public class U1_7_E10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int userInput1, userInput2, smallNum, bigNum;

        System.out.println("Please enter two positive integers: ");
        userInput1 = read.nextInt();
        userInput2 = read.nextInt();
        read.close();

        if (userInput1 > userInput2) {
            bigNum = userInput1;
            smallNum = userInput2;
        }
        else {
            bigNum = userInput2;
            smallNum = userInput1;
        }

        System.out.println("Counting from smaller number to bigger number:");
        for (int i = smallNum; i<=bigNum; i++) {
            System.out.println(i);
        }
    }
}