public class U2_4_E2 {
    public static void main(String[] args) {
        String letters[][] = {{"A"}, {"B", "C"}, {"D", "E", "F"}, {"G", "H", "I", "J"}};
        for (int i = 0; i<letters.length; i++) {
            for (int x = 0; x<letters[i].length; x++) {
                System.out.printf("%2s", letters[i][x]);
            }
            System.out.println();
        }
    }
}