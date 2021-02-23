/*
 *Date : 2021-02-23
 *URL : https://codeup.kr/problem.php?id=1086
 */
import java.util.Scanner;

public class CodeUp100_N1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int size = (w*h*b)/8;
        System.out.printf("%.2f MB",size/Math.pow(2,20));
    }
}
