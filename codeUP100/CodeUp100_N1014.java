/*
 *Date : 2021-02-16
 *URL : https://codeup.kr/problem.php?id=1014
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CodeUp100_N1014 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String c = bf.readLine();
        StringTokenizer st = new StringTokenizer(c);
        bf.close();

        String x = st.nextToken();
        String y = st.nextToken();
        System.out.println(y+" "+x);


    }
}