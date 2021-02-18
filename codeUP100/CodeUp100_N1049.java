/*
 *Date : 2021-02-18
 *URL : https://codeup.kr/problem.php?id=1049
 */
import java.util.Scanner;

public class CodeUp100_N1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println(a>b?1:0);
    }
}
