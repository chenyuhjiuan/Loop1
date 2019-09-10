public class MultipleNumTable {

    static final int MAX = 5;

    public static void main(String[] args) {
        int row, column;

        for (row = 1; row <= MAX; row++) {
            for (column = 1; column <= row; column++) {
                System.out.print(row);
            }
            System.out.println(); //Takes us to the next line
        }
    }
}
