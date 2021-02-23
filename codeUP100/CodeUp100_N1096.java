/*
 *Date : 2021-02-23
 *URL : https://codeup.kr/problem.php?id=1096
 */
import java.util.Scanner;

public class CodeUp100_N1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[19][19];

        for(int i=0;i<num;i++){
            arr[sc.nextInt()-1][sc.nextInt()-1]++;
        }
        sc.close();

        for(int i=0;i<19;i++){
            for(int j=0;j<19;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
