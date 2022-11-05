package 수학;

import java.util.Scanner;

public class 소수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[N+1];
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2;i<=Math.sqrt(N);i++){
            for(int j=i*i;j<=N;j+=i){
                arr[j] = 1;
            }
        }
        for(int i=M;i<=N;i++){
            if(arr[i]==0) System.out.println(i);
        }
    }
}
