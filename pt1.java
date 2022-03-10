package geeks;
import java.util.Scanner;
public class pt1 {
    public static void main(String[] args) {
        Scanner out = new Scanner(System.in);
        String q = out.nextLine();
        int n = q.length();
        char[][] d = new char[10][10];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    d[i][j] = q.charAt(i);
                    System.out.print(d[i][j]);
                } else if ((i + j) == n - 1) {
                    d[i][j] = q.charAt(j);
                    System.out.print(d[i][j]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }}}
