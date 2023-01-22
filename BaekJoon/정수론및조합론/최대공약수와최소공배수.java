package 정수론및조합론;

import java.util.Scanner;

public class 최대공약수와최소공배수 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int gcd = gcd(a,b);
        System.out.println(gcd);
        System.out.println(gcd*(a/gcd)*(b/gcd));
    }

    //유클리드 호제법
    public static int gcd(int a, int b){
        int r = a%b;
        if(r==0) return b;
        return gcd(b,r);
    }
}
