/*
 *Date : 2021-02-16
 *URL : https://codeup.kr/problem.php?id=1019
 */
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CodeUp100_N1019 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        sc.close();

        StringTokenizer st = new StringTokenizer(date,".");
        String[] result = new String[3];
        int i=0;

        while(st.hasMoreTokens()){
            result[i]=st.nextToken();
            i++;
        }

        int year = Integer.parseInt(result[0]);
        int month = Integer.parseInt(result[1]);
        int day = Integer.parseInt(result[2]);

        System.out.printf("%4d.%02d.%02d",year,month,day);
    }
}