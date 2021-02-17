/*
 *Date : 2021-02-17
 *URL : https://codeup.kr/problem.php?id=1035
 */
import java.util.Scanner;

public class CodeUp100_N1035 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        sc.close();

        int hex = Integer.parseInt(a,16);
        String octal = Integer.toOctalString(hex);
        System.out.println(octal);
    }
}
