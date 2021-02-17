/*
 *Date : 2021-02-17
 *URL : https://codeup.kr/problem.php?id=1034
 */
import java.util.Scanner;

public class CodeUp100_N1034 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String octal = sc.nextLine();
        sc.close();

        int ans = Integer.parseInt(octal,8);
        System.out.println(ans);
    }
}
