/*
 *Date : 2021-02-22
 *URL : https://codeup.kr/problem.php?id=1077
 */
import java.util.Scanner;

public class CodeUp100_N1077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int start = 0;
        sc.close();

        while(start<=num){
            System.out.println(start++);
        }
    }
}
