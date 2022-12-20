package 재귀;

import java.io.*;
import java.util.*;

public class 알고리즘수업_병합정렬1 {
    private static int k;
    private static int[] src;
    private static int[] tmp;
    private static int cnt = 0;
    private static int result = -1;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        src = new int[n];
        tmp = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            src[i] = Integer.parseInt(st.nextToken());
        }

        System.out.print(mergeSort(0,src.length-1));
    }

    public static int mergeSort(int start, int end){
        if(start<end){
            int mid = (start+end)/2;
            mergeSort(start,mid);
            mergeSort(mid+1,end);

            int p = start;
            int q = mid+1;
            int idx = p;

            while(p<=mid || q<=end){
                if(q>end || (p<=mid && src[p]<src[q])){
                    tmp[idx++] = src[p++];
                }else tmp[idx++] = src[q++];
            }

            for(int i=start;i<=end;i++){
                cnt+=1;
                src[i] = tmp[i];
                if(cnt==k) result = src[i];
            }
        }
        return result;
    }
}
