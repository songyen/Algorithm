package 수학;

import java.util.Scanner;

public class 분수찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1) System.out.println("1/1");
        else{
            int col = 1;
            int max = 1;
            while(n>max){
                col++;
                max = col*(col+1)/2;
                break;
            }
            if(col%2==0) System.out.println((col-(max-n))+"/"+(1+(max-n)));
            else System.out.println((1+(max-n))+"/"+(col-(max-n)));
        }
    }
}
