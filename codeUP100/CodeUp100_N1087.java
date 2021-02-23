/*
 *Date : 2021-02-23
 *URL : https://codeup.kr/problem.php?id=1087
 */
import java.util.Scanner;

public class CodeUp100_N1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum=0;
        sc.close();

        for(int i=1;;i++){
            sum+=i;
            if(sum>=a) break;
        }
        System.out.println(sum);
    }
}
