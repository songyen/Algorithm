package 재귀;

import java.util.Scanner;

public class 피보나치수5 {
    private static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[21];
        arr[1] = 1;
        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n) {
        if(n==0) return 0;
        else if(n==1) return 1;
        else return arr[n]=fibonacci(n-1)+arr[n-2];
    }
}
