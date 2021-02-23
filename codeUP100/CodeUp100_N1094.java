/*
 *Date : 2021-02-23
 *URL : https://codeup.kr/problem.php?id=1094
 */
import java.util.Scanner;

public class CodeUp100_N1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] call = new int[num];

        for(int i=0;i<num;i++){
            call[i]=sc.nextInt();
        }
        sc.close();
        for(int i=num-1;i>=0;i--){
            System.out.print(call[i]+" ");
        }
    }
}
