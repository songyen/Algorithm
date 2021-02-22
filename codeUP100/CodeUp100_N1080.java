/*
 *Date : 2021-02-22
 *URL : https://codeup.kr/problem.php?id=1080
 */
import java.util.Scanner;

public class CodeUp100_N1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        sc.close();

        int i=0;
        while(sum<a){
            i++;
            sum+=i;
        }
        System.out.println(i);
    }
}
