/*
 *Date : 2021-02-19
 *URL : https://codeup.kr/problem.php?id=1069
 */
import java.util.Scanner;

public class CodeUp100_N1069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char com = sc.nextLine().charAt(0);
        sc.close();

        switch (com){
            case 'A' : System.out.println("best!!");break;
            case 'B' : System.out.println("good!!");break;
            case 'C' : System.out.println("run!");break;
            case 'D' : System.out.println("slowly~");break;
            default : System.out.println("what?");break;
        }
    }
}
