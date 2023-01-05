package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 체스판다시칠하기 {
    private static int[][] blackChess = new int[8][8];
    private static boolean[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        //입력
        arr = new boolean[n][m];
        for(int i=0;i<n;i++){
            String str =  br.readLine();
            for(int j=0;j<m;j++){
                if(str.charAt(j)=='B') arr[i][j] = true;
                else arr[i][j] = false;
            }
        }
        //8X8크기로 체스판 자르기
        int min = 64;
        for(int i=0;i<=n-8;i++){
            for(int j=0;j<=m-8;j++){
                min = Math.min(min, findMin(i,j));
            }
        }
        System.out.println(min);
    }

    private static int findMin(int row, int col) {
        int count = 0;
        boolean color = arr[row][col]; //첫번째칸의 색
        for(int i=row;i<row+8;i++){
            for(int j=col;j<col+8;j++){
                if(arr[i][j]!=color) count++;
                color = (!color);
            }
            color = (!color);
        }
        count = Math.min(count, 64-count);
        return count;
    }
}
