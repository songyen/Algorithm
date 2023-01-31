package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 스타트와링크 {
    private static boolean[] visited;
    private static int[][] arr;
    private static int n;
    private static int diff = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new boolean[n];
        StringTokenizer st;
        //배열 입력 받기
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0;j<n;j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //팀 조합 및 시너지 구하기 시작
        bt(0,0);
        System.out.println(diff);
    }

    private static void bt(int idx, int cnt) {
        //팀원수가 찼다면, 방문한 팀과 방문하지 않은 팀의 시너지 차 구하기
        if(cnt==n/2){
            int visitedTeam = 0;
            int unvisitedTeam = 0;
            for(int i=0;i<visited.length-1;i++){
                for(int j=i+1;j<visited.length;j++){
                    //방문한 팀 시너지 구하기
                    if(visited[i]==true && visited[j]==true){
                        visitedTeam += arr[i][j];
                        visitedTeam += arr[j][i];
                    }
                    //방문하지 않은 팀 시너지 구하기
                    else if(visited[i]==false && visited[j]==false){
                        unvisitedTeam += arr[i][j];
                        unvisitedTeam += arr[j][i];
                    }
                }
            }
            diff = Math.min(diff,Math.abs(visitedTeam-unvisitedTeam));
            if(diff==0){
                System.out.println(diff);
                System.exit(0);
            }
            return;
        }

        //팀조합 구하기 위한 재귀호출
        for(int i=idx;i<visited.length;i++){
            if(!visited[i]){
                visited[i] = true;
                bt(i+1, cnt+1);
                visited[i] = false;
            }
        }
    }
}
