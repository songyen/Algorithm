package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class 일곱난쟁이 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        br.close();
        int a = 0;
        int b = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(sum-arr[i]-arr[j]==100){
                    a = arr[i];
                    b = arr[j];
                }
            }
            if(a!=0 && b!=0) break;
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a || arr[i]==b) continue;
            System.out.println(arr[i]);
        }
    }
}
