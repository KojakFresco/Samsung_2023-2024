package tasks;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] x = new int[n][m];

        int num = 0;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (i % 2 == 0) {
                    x[i][j] = num;
                } else {
                    x[i][m - j - 1] = num;
                }
                ++num;
            }
        }
        print2D(x);
    }
    public static void print2D(int[][] y) {
        for (int i = 0; i < y.length; ++i) {
            for (int j = 0; j < y[i].length; ++j) {
                if (y[i][j] < 10) {
                    System.out.print(" ");
                }
                if (j == 0) {
                    System.out.print(" ");
                }
                System.out.print(y[i][j] + " ");
            }
            System.out.println();
        }
    }

}
