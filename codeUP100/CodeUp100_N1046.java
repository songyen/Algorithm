/*
 *Date : 2021-02-18
 *URL : https://codeup.kr/problem.php?id=1046
 */
import java.io.IOException;
import java.util.Scanner;

public class CodeUp100_N1046 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        System.out.println((long)a+b+c);
        System.out.println((float)(a+b+c)/3);
    }
}
