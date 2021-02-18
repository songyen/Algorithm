/*
 *Date : 2021-02-18
 *URL : https://codeup.kr/problem.php?id=1043
 */
import java.io.IOException;
import java.util.Scanner;

public class CodeUp100_N1043 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println(a%b);
    }
}
