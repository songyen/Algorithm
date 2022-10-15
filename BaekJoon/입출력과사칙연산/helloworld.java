package 입출력과사칙연산;

import java.util.Scanner;

public class helloworld {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = 0;
        if(a==b && b==c){
            result = 10000+a*1000;
        } else if (a==b || b==c || a==c) {
            if(a==b) {
                result = 1000+a*100;
            }
            else result = 1000+c*100;
        }else {
            result = Math.max(Math.max(a,b),c)*100;
        }
        System.out.println(result);
    }
}
