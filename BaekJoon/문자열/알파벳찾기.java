package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알파벳찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] alphabet = new int[26];
        for(char i=0;i<26;i++){
            alphabet[i] = -1;
        }
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            alphabet[c-'a'] = input.indexOf(c);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<26;i++){
            sb.append(alphabet[i]+" ");
        }
        System.out.println(sb.toString().trim());
    }
}
