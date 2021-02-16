/*
 *Date : 2021-02-16
 *URL : https://codeup.kr/problem.php?id=1020
 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class CodeUp100_N1020 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String jumin = sc.nextLine();
        sc.close();

        StringTokenizer st = new StringTokenizer(jumin,"-");

        String result ="";
        while(st.hasMoreTokens()){
            result += st.nextToken();
        }

        System.out.println(result);
    }
}
