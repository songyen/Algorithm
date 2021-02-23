/*
 *Date : 2021-02-23
 *URL : https://codeup.kr/problem.php?id=1092
 */
import java.util.Scanner;

public class CodeUp100_N1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int day=1;
        for(int i=0;;i++) {
            if (day % a == 0 && day % b == 0 && day % c == 0) {
                System.out.println(day);
                break;
            }
            day++;
        }
    }
}
