/*
 *Date : 2021-02-19
 *URL : https://codeup.kr/problem.php?id=1055
 */
import java.util.Scanner;

public class CodeUp100_N1055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if(a==1 || b==1)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
