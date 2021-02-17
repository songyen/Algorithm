/*
 *Date : 2021-02-17
 *URL : https://codeup.kr/problem.php?id=1027
 */
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CodeUp100_N1027 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        sc.close();

        StringTokenizer st = new StringTokenizer(date,".");
        int year = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        System.out.printf("%02d-%02d-%04d",day,month,year);
    }
}
