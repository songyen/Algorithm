/*
 *Date : 2021-02-17
 *URL : https://codeup.kr/problem.php?id=1033
 */
import java.util.Scanner;

public class CodeUp100_N1033 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        String ans = String.format("%X",a);
        System.out.println(ans);
    }
}
