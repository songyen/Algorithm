package 수학;

import java.util.Scanner;

public class 설탕배달 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = -1;

        for(int i=N/5;i>=0;i--){
            int weight = N;
            weight -= 5*i;
            if(weight%3==0) {
                result = i+weight/3;
                break;
            }
        }
        System.out.println(result);
    }
}
