/*
 *Date : 2021-02-17
 *URL : https://codeup.kr/problem.php?id=1025
 */
import java.util.Scanner;

public class CodeUp100_N1025 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String var = sc.nextLine();
        sc.close();

        for(int i=0;i<var.length();i++){
            System.out.println("["+(var.charAt(i)-'0')*(int)Math.pow(10,(var.length()-1-i))+"]");
        }
    }
}
