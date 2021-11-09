package 구현;

import java.io.*;

public class 알파벳찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while(T --> 0) {
            String binary = Integer.toBinaryString(Integer.parseInt(br.readLine()));
            int len = binary.length();
            for (int i=len-1;i>=0;i--){
                if(binary.charAt(i)=='1') sb.append(len-1-i+" ");
            }
        }
        br.close();
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}
