/*
 *Date : 2021-02-22
 *URL : https://codeup.kr/problem.php?id=1076
 */
import java.util.Scanner;

public class CodeUp100_N1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = 'a';
        sc.close();

        do{
            System.out.print(b++ +" ");
        }while(b<=a);
    }
}
