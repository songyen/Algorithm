/*
 *Date : 2021-02-22
 *URL : https://codeup.kr/problem.php?id=1085
 */
import java.util.Scanner;

public class CodeUp100_N1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s = sc.nextInt();
        sc.close();

        int size = (h*b*c*s)/8;
        System.out.printf("%.1f MB",(float)size/Math.pow(2,20));
    }
}
