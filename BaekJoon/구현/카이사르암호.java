package 구현;

import java.io.*;

public class 카이사르암호 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String letter = br.readLine();
        br.close();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<letter.length();i++){
            char c = letter.charAt(i);
            if('D'<=c && c<='Z') sb.append((char)(c-3));
            else sb.append((char)(c+23));
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}
