import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] y = new int[n][m];

        for (int i = 0; i < y.length; ++i) {
            for (int j = 0; j < y[i].length; ++j) {
                y[i][j] = scan.nextInt();
            }
            System.out.println();
        }

        print2D(y);
    }

    public static void print2D(int[][] y) {
        for (int i = 0; i < y.length; ++i) {
            for (int j = 0; j < y[i].length; ++j) {
                System.out.print(y[i][j] + " ");
            }
            System.out.println();
        }
    }
}