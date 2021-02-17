/*
 *Date : 2021-02-17
 *URL : https://codeup.kr/problem.php?id=1026
 */
import java.util.Scanner;
public class CodeUp100_N1026 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        sc.close();

        String[] min = time.split(":");
        System.out.println(min[1]);
    }
}
