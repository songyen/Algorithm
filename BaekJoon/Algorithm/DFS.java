/*
* reference : https://hoho325.tistory.com/99(스택으로 구현), https://raspberrypi98.tistory.com/68(재귀로 구현)
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
    private static int cnt;
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

        //지도탐색(스택풀이방법)
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                //단지를 갖추고 있는지 dfs로 탐색
                if(map[i][j] == 1){
                    answer.add(dfs(i,j));
                }
            }
        }

        /*
        *지도탐색(재귀풀이방법)
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                //단지를 갖추고 있는지 dfs로 탐색
                if(map[i][j] == 1){
                    cnt = 1;
                    map[i][j] = 0;
                    dfs(i,j);
                    answer.add(cnt);
                }
            }
        }
         */


        Collections.sort(answer);
        System.out.println(answer.size());
        for(int i=0;i<answer.size();i++){
            System.out.println(answer.get(i));
        }
    }

    //dfs(스택으로 구현)
    public static int dfs(int x, int y){
        int[] dirX = {1,0,0,-1};
        int[] dirY = {0,-1,1,0};
        Stack<Point> location = new Stack<>();

        //시작노드 방문처리
        map[x][y] = 0;
        int townSize = 1;

        int nextX = x;
        int nextY = y;
        location.push(new Point(x,y));//시작노드 스택에 넣기

        while(!location.isEmpty()){
            Point point = location.pop();//부모노드의 탐색시작
            for(int i=0;i<4;i++){//아래-왼쪽-오른쪽-위 탐색
                nextX = point.x + dirX[i];
                nextY = point.y + dirY[i];

                if(map[nextX][nextY] == 1){
                    map[nextX][nextY] = 0;//자식노드 방문처리
                    townSize++;
                    location.add(new Point(nextX,nextY));//자식노드 스택에 넣기
                }
            }
        }
        return townSize;
    }

    /*
    * dfs(재귀로 구현)
    public static void dfs(int x, int y){
        int[] dirX = {1,0,0,-1};
        int[] dirY = {0,-1,1,0};

        for(int i=0;i<4;i++) {//아래-왼쪽-오른쪽-위 탐색
            int nextX = x + dirX[i];
            int nextY = y + dirY[i];
            if (map[nextX][nextY] == 1) {
                map[nextX][nextY] = 0;
                cnt++;
                dfs(nextX, nextY);
            }
        }
    }*/
}
