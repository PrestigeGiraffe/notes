public class U2_4_E1 {
    public static void main(String[] args) {
        int[][] table;
        table = new int[5][6];

        for (int i = 0; i<table.length; i++) {
            for (int x = 0; x<table[0].length; x++) {
                table[i][x] = (int)Math.round(Math.random() * 100);
            }
        }

        for (int i[]: table) {
            for (int x: i) {
                System.out.printf("%3d", x);
            }
            System.out.println("");
        }
    }
}