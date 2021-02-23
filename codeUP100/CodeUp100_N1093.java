/*
 *Date : 2021-02-23
 *URL : https://codeup.kr/problem.php?id=1093
 */
import java.util.Scanner;

public class CodeUp100_N1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] call = new int[23];
        for(int i=0;i<num;i++){
            call[sc.nextInt()-1]++;
        }
        for(int i=0;i<23;i++){
            System.out.print(call[i]+" ");
        }
    }
}
