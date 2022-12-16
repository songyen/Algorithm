package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 재귀의귀재 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            String s = br.readLine();
            recursive(s, 0, s.length()-1);
        }
        br.close();
    }

    private static void recursive(String s, int h, int t) {
        if(h>=t) System.out.println(1+" "+(h+1));
        else if(s.charAt(h)!=s.charAt(t)) System.out.println(0+" "+(h+1));
        else recursive(s, h+1, t-1);
    }
}
