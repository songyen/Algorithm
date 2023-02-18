package 동적계획법;

import java.util.Scanner;

public class 알고리즘수업_피보나치수1 {
    private static int case1 = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci_case1(n);
        System.out.println(case1+" "+(n-2));
    }
    private static int fibonacci_case1(int n) {
        if(n==1 || n==2) {
            case1++;
            return 1;
        }
        else return fibonacci_case1(n-1)+fibonacci_case1(n-2);
    }
}
