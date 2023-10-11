package tasks;

import java.util.Scanner;

public class Fourth {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] a = new int[n][m];
        int c = 0;
        int d  = 0;
        for (int i = 0; i < n * m; ++i) {
            if (c == m) {
                c = 0;
                d++;
            }
            a[d][c] = d * c;
            ++c;
        }
        print2D(a);
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
