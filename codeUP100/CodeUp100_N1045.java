/*
 *Date : 2021-02-18
 *URL : https://codeup.kr/problem.php?id=1045
 */
import java.io.IOException;
import java.util.Scanner;

public class CodeUp100_N1045 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        sc.close();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.printf("%.2f",(float)a/b);
    }
}
