/*
 *Date : 2021-02-19
 *URL : https://codeup.kr/problem.php?id=1070
 */
import java.util.Scanner;

public class CodeUp100_N1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mon = sc.nextInt();
        sc.close();

        if(mon==1 || mon==2 || mon==12)
            System.out.println("winter");
        else if(mon>=3 && mon<=5)
            System.out.println("spring");
        else if(mon>=6 && mon<=8)
            System.out.println("summer");
        else
            System.out.println("fall");
    }
}
