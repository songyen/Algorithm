package 기하;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 직각삼각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            String answer = "wrong";
            if(a==0 && b==0 && c==0) break;
            else{
                if( (a*a + b*b) == c*c || (b*b + c*c) == a*a || (c*c + a*a) == b*b) answer = "right";
            }
            System.out.println(answer);
        }
    }
}
