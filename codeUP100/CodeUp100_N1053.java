/*
 *Date : 2021-02-19
 *URL : https://codeup.kr/problem.php?id=1053
 */
import java.util.Scanner;

public class CodeUp100_N1053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();


        if(a==0||a==1){
            if(a==1)
                System.out.println(0);
            else
                System.out.println(1);
        }
        else
            System.out.println("0또는 1만 입력하세요");
    }
}
