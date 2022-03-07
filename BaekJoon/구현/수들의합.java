package 구현;

import java.util.Scanner;

public class 수들의합 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();
        long n = 1;
        while(n*(n+1)<=2*S){
            n++;
        }
        System.out.println(n-1);
    }
}
