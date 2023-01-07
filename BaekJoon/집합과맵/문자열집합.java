package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문자열집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = br.readLine();
        }
        int answer = 0;
        for(int i=0;i<m;i++){
            String str = br.readLine();
            for(int j=0;j<n;j++){
                if(arr[j].equals(str)) {
                    answer++;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
