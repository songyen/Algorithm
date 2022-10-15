package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OX퀴즈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            System.out.println(getScore(br.readLine()));
        }
        br.close();
    }

    public static int getScore(String ox){
        int continuity = 0;
        int score = 0;
        for(int i=0;i<ox.length();i++){
            if(ox.charAt(i) == 'O') continuity++;
            else continuity = 0;

            score+=continuity;
        }
        return score;
    }
}
