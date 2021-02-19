/*
 *Date : 2021-02-19
 *URL : https://codeup.kr/problem.php?id=1068
 */
import java.util.Scanner;

public class CodeUp100_N1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        sc.close();

        if(score>=90 && score<=100)
            System.out.println("A");
        else if(score>=70 && score<90)
            System.out.println("B");
        else if(score>=40 && score<70)
            System.out.println("C");
        else
            System.out.println("D");
    }
}
