public class U1_7_ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i<=6; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "A ");
            }
            else {
                System.out.print(i + "B ");
            }
        }
    }
}