package 그래프탐색.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 색종이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] paper = new int[100][100];
        StringTokenizer st;
        int width;
        int hight;
        for(int T=0;T<n;T++){
            st = new StringTokenizer(br.readLine());
            width = Integer.parseInt(st.nextToken());
            hight = Integer.parseInt(st.nextToken());
            for(int i=width;i<width+10;i++) {
                for(int j=hight;j<hight+10;j++) {
                    paper[i][j] = 1;
                }
            }
        }
        int dup = 0;
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(paper[i][j]==1) dup++;
            }
        }
        System.out.println(dup);
    }
}
