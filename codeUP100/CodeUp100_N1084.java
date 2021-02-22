/*
 *Date : 2021-02-22
 *URL : https://codeup.kr/problem.php?id=1084
 */
import java.util.Scanner;

public class CodeUp100_N1084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<g;j++){
                for(int k=0;k<b;k++){
                    System.out.println(i+" "+j+" "+k);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
