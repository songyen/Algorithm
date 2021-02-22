/*
 *Date : 2021-02-22
 *URL : https://codeup.kr/problem.php?id=1082
 */
import java.util.Scanner;

public class CodeUp100_N1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next(),16);
        sc.close();

        for(int i=1;i<=Integer.parseInt("F",16);i++){
            System.out.printf("%X*%X=%X\n",num,i,num*i);
        }
    }
}
