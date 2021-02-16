/*
 *Date : 2021-02-16
 *URL : https://codeup.kr/problem.php?id=1023
 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class CodeUp100_N1023 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringTokenizer st = new StringTokenizer(s,".");
        sc.close();

        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
    }
}
