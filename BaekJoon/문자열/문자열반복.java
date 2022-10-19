package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열반복 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            String[] input = br.readLine().split(" ");
            int R = Integer.parseInt(input[0]);
            String S = input[1];
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<S.length();j++){
                char c = S.charAt(j);
                for(int k=0;k<R;k++){
                    sb.append(c);
                }
            }
            System.out.println(sb);
        }
    }
}
