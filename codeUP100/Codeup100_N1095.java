/*
 *Date : 2021-02-23
 *URL : https://codeup.kr/problem.php?id=1095
 */
import java.util.Scanner;

public class Codeup100_N1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] call = new int[num];
        for(int i=0;i<num;i++){
            call[i]=sc.nextInt();
        }

        int min=call[0];
        for(int i=1;i<num;i++){
            if(min>call[i]){
                min=call[i];
            }
        }
        System.out.println(min);
    }
}
