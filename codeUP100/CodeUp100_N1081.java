/*
 *Date : 2021-02-22
 *URL : https://codeup.kr/problem.php?id=1081
 */
import java.util.Scanner;

public class CodeUp100_N1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                System.out.println(i+" "+j);
            }
        }
    }
}
