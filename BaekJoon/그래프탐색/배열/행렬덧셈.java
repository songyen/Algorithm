package 그래프탐색.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 행렬덧셈 {
    private static int N;
    private static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        for(int T=0;T<2;T++) {
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    if(T==0) A[i][j] = Integer.parseInt(st.nextToken());
                    if(T==1) B[i][j] = Integer.parseInt(st.nextToken());
                }
            }
        }

        StringBuilder sb;
        for(int i=0;i<N;i++){
            sb = new StringBuilder();
            for(int j=0;j<M;j++){
                sb.append(A[i][j]+B[i][j]);
                sb.append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
