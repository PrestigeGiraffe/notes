import java.util.Arrays;

public class U2_5_E1 {
    public static void main(String[] args) {
        // create array
        int[] randomNumbers = new int[10];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int)Math.round(Math.random()*100);

            // sort
            int holder;
            for (int x = 0; x > 0; x--)
            {
                if (i != 0 && randomNumbers[i] < randomNumbers[i-x]) {
                    holder = randomNumbers[i-1];
                    randomNumbers[i-1] = randomNumbers[i];
                    randomNumbers[i-1] = holder;
                }
            }
           

        }

        // output
        System.out.print(Arrays.toString(randomNumbers));
    }
}