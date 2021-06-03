package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DFS미로찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] map = new int[n+2][m+2];
        for(int i=1;i<=n;i++){
            String line = br.readLine();
            for(int j=1;j<=m;j++) {
                map[i][j] = line.charAt(j-1) - '0';
            }
        }

        int answer = 1;
        int x = 1;
        int y = 1;
        while(x!=n || y!=m){
            if(map[x][y+1] == 1){
                map[x][y] = 0;
                y+=1;
                answer++;
                continue;
            }
            if(map[x+1][y] == 1){
                map[x][y] = 0;
                x+=1;
                answer++;
                continue;
            }
            if(map[x-1][y] == 1){
                map[x][y] = 0;
                x-=1;
                answer++;
                continue;
            }
            if(map[x][y-1] == 1){
                map[x][y] = 0;
                y-=1;
                answer++;
                continue;
            }
        }
        System.out.println(answer);
    }
}
