/*
 *Date : 2021-02-19
 *URL : https://codeup.kr/problem.php?id=1064
 */
import java.util.Scanner;

public class CodeUp100_N1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        System.out.println((a<b?a:b)<c?(a<b?a:b):c);
    }
}
