package 정수론및조합론;

import java.util.Scanner;

public class 팩토리얼0의개수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=1;i<=n;i++){
            int tmp = i;
            while(tmp%5==0){
                count++;
                tmp/=5;
            }
        }
        System.out.println(count);
    }
}
