package 정수론및조합론;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 검문 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        ArrayList<Integer> answer = new ArrayList<>();
        int m = arr[1]-arr[0];
        for(int i=2;i<n;i++){
            m = gcd(m,arr[i]-arr[i-1]);
        }
        for(int i=2;i<=m;i++){
            if(m%i==0) answer.add(i);
        }
        Collections.sort(answer);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<answer.size();i++){
            sb.append(answer.get(i)+" ");
        }
        System.out.println(sb.toString().trim());
    }

    public static int gcd(int a, int b){
        int r = a%b;
        if(r==0) return b;
        return gcd(b,r);
    }
}
