/*
 *Date : 2021-02-22
 *URL : https://codeup.kr/problem.php?id=1075
 */
import java.util.Scanner;

public class CodeUp100_N1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(num!=0){
            System.out.println(--num);
        }
        sc.close();
    }
}
