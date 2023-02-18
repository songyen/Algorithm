package 그리디알고리즘;

import java.util.Scanner;

public class 동전0 {
    private static int[] arr;
    private static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        findChange(K);
        System.out.println(cnt);
    }

    private static int findChange(int k) {
        int idx = 0;
        while(idx<arr.length && k!=0){
            if(k<arr[idx] || idx==arr.length-1) {
                if(k<arr[idx]) cnt += k / arr[--idx];
                else cnt += k/arr[idx];
                k %= arr[idx];
            }else idx++;
        }
        return k;
    }
}
