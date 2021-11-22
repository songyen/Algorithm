package 구현;

import java.util.Scanner;

public class 피보나치수5 {
    private static int[] arr;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[21];
        arr[1] = 1;
        System.out.println(factorial(n));
    }

    public static int factorial(int n){
        if(n==0) return 0;
        else if(n==1) return 1;
        else{
            return arr[n]=factorial(n-1)+arr[n-2];
        }
    }
}
