/*
* source : BackJoon 2667번 [단지번호붙이기]
 */

package Algorithm;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class DFS {
    private static int[][] map;
    private static boolean[][] visited;
    private static int townNum = 2;
    private static List<Integer> answer = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        //map입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        map = new int[n+2][n+2];
        for(int i=1;i<=n;i++){
            String road = br.readLine();
            for(int j=1;j<=n;j++){
                map[i][j] = road.charAt(j-1) - '0';
            }
        }

        //지도탐색
        visited = new boolean[n+2][n+2];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(visited[i][j]) continue;
                else visited[i][j] = true;

                //단지를 갖추고 있는지 dfs로 탐색
                if(map[i][j] == 1) dfs(i,j);
            }
        }

        Collections.sort(answer);
        System.out.println(answer.size());
        for(int i=0;i<answer.size();i++){
            System.out.println(answer.get(i));
        }
    }

    public static void dfs(int i, int j){
//        int[] nextX = {1,0,0,-1};
//        int[] nextY = {0,-1,1,0};
        Stack<Point> location = new Stack<>();
        Point lastLocation;
        int townSize = 1;
        while(true){
            visited[i][j] = true;

            if(map[i+1][j] == 1 || map[i][j-1] == 1 || map[i][j+1] == 1 || map[i-1][j] == 1){
                map[i][j] = townNum;
                location.push(new Point(i,j));
                townSize++;
                if(map[i+1][j] == 1){
                    i+=1;
                }else if(map[i][j-1] == 1){
                    j-=1;
                }else if(map[i][j+1] == 1){
                    j+=1;
                }else {
                    i-=1;
                }
            }else{//되돌아가야해
                if(location.size() == 0) break; //되돌아갈 곳 없음
                else{
                    map[i][j] = townNum;
                    lastLocation = location.pop();
                    i = lastLocation.x;
                    j = lastLocation.y;
                }
            }
        }
        if(townSize!=1) answer.add(townSize);
    }
}
