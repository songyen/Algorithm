/*
 *Date : 2021-02-19
 *URL : https://codeup.kr/problem.php?id=1067
 */
import java.util.Scanner;

public class CodeUp100_N1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        if(a>0)
            System.out.println("plus");
        else
            System.out.println("minus");
        if(a%2==0)
            System.out.println("even");
        else
            System.out.println("odd");


    }
}
