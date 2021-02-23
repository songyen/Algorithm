/*
 *Date : 2021-02-23
 *URL : https://codeup.kr/problem.php?id=1090
 */
import java.util.Scanner;

public class CodeUp100_N1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        int count=0;
        for(int i=a;;i*=r){
            count++;
            if(count==n){
                System.out.println(i);
                break;
            }
        }
    }
}
