package iterating_over_arrays.multiplication_table;

public class Main {
    public static void main(String[] args) {
        multiTable(10);
        System.out.println();
        multiTableWithArray(10);

    }

    public static void multiTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

    public static void multiTableWithArray(int size) {
        int[][] table = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        }
    }
}

