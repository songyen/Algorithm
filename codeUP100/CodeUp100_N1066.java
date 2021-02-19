/*
 *Date : 2021-02-19
 *URL : https://codeup.kr/problem.php?id=1066
 */
import java.util.Scanner;

public class CodeUp100_N1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        if(a%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
        if(b%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
        if(c%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}
