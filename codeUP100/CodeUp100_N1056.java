/*
 *Date : 2021-02-19
 *URL : https://codeup.kr/problem.php?id=1056
 */
import java.util.Scanner;

public class CodeUp100_N1056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if(a!=b)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
