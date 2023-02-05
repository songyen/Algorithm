package 누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//reference : https://velog.io/@isohyeon/Java-%EB%B0%B1%EC%A4%80-10986-%EB%82%98%EB%A8%B8%EC%A7%80-%ED%95%A9
public class 나머지합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        int[] r = new int[m];
        st = new StringTokenizer(br.readLine());
        int cnt = 0;
        for(int i=1;i<=n;i++){
            arr[i]=(Integer.parseInt(st.nextToken())+arr[i-1])%m;
            if(arr[i]==0) cnt++;
            //(arr[j]-arr[i-1])%m==0은
            //arr[i]%m==arr[i]%m 과 같으며 즉, 구간핪이 m으로 나눠진 나머지값(r[])이 같은 모든 경우의 수
            r[arr[i]]++;
        }
        for(int i=0;i<r.length;i++){
            if(r[i]!=0){
                cnt+=(r[i]*(r[i]-1))/2;
            }
        }
        System.out.println(cnt);
    }
}
