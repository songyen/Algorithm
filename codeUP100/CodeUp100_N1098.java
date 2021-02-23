/*
 *Date : 2021-02-23
 *URL : https://codeup.kr/problem.php?id=1098
 */
import java.util.Scanner;

public class CodeUp100_N1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt();
        int[][] arr = new int[w][h];
        int n = sc.nextInt();
        for (int k = 0; k < n; k++) {
            int l = sc.nextInt(), d = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
            if (d == 0) {
                for (int i = y - 1; i < y-1+l; i++) {
                    arr[x-1][i] = 1;
                }
            }
            else{
                for (int i = x - 1; i < x-1+l; i++) {
                  arr[i][y-1] = 1;
                }
            }
        }
        sc.close();
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
