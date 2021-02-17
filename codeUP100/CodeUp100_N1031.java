/*
 *Date : 2021-02-17
 *URL : https://codeup.kr/problem.php?id=1031
 */
import java.util.Scanner;

public class CodeUp100_N1031 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        String octal = Integer.toOctalString(a);

        System.out.println(octal);
    }
}
