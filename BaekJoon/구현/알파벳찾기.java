package 구현;

import java.io.*;

public class 알파벳찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        br.close();
        for(char i='a';i<='z';i++){
            String alphabet = String.valueOf(i);
            if(s.contains(alphabet)) sb.append(s.indexOf(alphabet)+" ");
            else sb.append("-1 ");
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}
