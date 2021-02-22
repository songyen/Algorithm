/*
 *Date : 2021-02-22
 *URL : https://codeup.kr/problem.php?id=1083
 */
import java.util.Scanner;

public class CodeUp100_N1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        for(int i=1;i<=a;i++){
            if(i%3==0)
                System.out.print("X ");
            else
                System.out.print(i+" ");
        }
    }
}
