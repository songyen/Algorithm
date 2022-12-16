package 정렬;

import java.util.Scanner;

public class 팩토리얼 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(factorial(n));
    }

    private static int factorial(int n) {
        if(n==0 || n==1) return 1;
        else return n*factorial(n-1);
    }
}
