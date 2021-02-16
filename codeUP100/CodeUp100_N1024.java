/*
 *Date : 2021-02-16
 *URL : https://codeup.kr/problem.php?id=1024
 */
import java.util.Scanner;

public class CodeUp100_N1024 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        sc.close();

        for(int i=0;i<c.length();i++){
            System.out.println("\'"+c.charAt(i)+"\'");
        }
    }
}
