/*
 *Date : 2021-02-22
 *URL : https://codeup.kr/problem.php?id=1078
 */
import java.util.Scanner;

public class CodeUp100_N1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        sc.close();

        for(int i=0;i<=a;i+=2){
            sum+=i;
        }
        System.out.println(sum);
    }
}
