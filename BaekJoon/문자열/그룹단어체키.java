package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 그룹단어체키 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int result = 0;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            if(check(st.nextToken())) result++;
        }
        System.out.println(result);
    }

    public static boolean check(String param) {
        int[] arr = new int[26];
        for (int i = 0; i < param.length(); i++) {
            char c = param.charAt(i);
            int idx = (int) c - 'a';
            if (arr[idx] == 0 || i == 0) arr[idx] = 1;
            else if (i > 0 && arr[idx] == 1 && c != param.charAt(i - 1)) return false;
        }
        return true;
    }
}
