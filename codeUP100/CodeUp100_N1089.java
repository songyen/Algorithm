/*
 *Date : 2021-02-23
 *URL : https://codeup.kr/problem.php?id=1089
 */
import java.util.Scanner;

public class CodeUp100_N1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        int count=0;
        for(int i=a;;i+=d){
            count++;
            if(count==n) {
                System.out.println(i);
                break;
            }
        }
    }
}
