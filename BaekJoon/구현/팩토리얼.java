package 구현;

import java.util.Scanner;

public class 팩토리얼 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.print(factorial(n));
    }

    public static int factorial(int n){
        if(n==1 || n==0) return 1;
        return n * factorial(n-1);
    }
}
