package 브루트포스;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class 분해합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for(int i=0;i<n;i++){
            int number = i;
            int sum = number;

            while(number!=0){
                sum+=number%10;
                number/=10;
            }

                if(sum==n) {
                    result = i;
                    break;
                }
            }
        System.out.println(result);
        }
}
