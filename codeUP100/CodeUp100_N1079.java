/*
 *Date : 2021-02-22
 *URL : https://codeup.kr/problem.php?id=1079
 */
import java.io.IOException;
import java.util.Scanner;

public class CodeUp100_N1079 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while(true){
            char a = sc.next().charAt(0);
            if(a=='q'){
                System.out.println(a);
                break;
            }
            System.out.println(a);
        }
        sc.close();
    }
}
