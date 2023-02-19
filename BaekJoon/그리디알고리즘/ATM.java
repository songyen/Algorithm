package 그리디알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        int wait = 0;
        int sum = 0;
        for(int i=0;i<N;i++){
            wait += arr[i];
            sum += wait;
        }
        System.out.println(sum);
    }
}
