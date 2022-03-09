package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 사탕게임 {
    private static int N;
    private static char[][] array;
    private static int max = 2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        array = new char[N][N];
        //사탕배열 입력 초기화
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                array[i] = br.readLine().toCharArray();
            }
        }
        for(int i=0;i<N;i++){
            //행 기준 비교
            for(int j=0;j<N-1;j++){
                if(array[i][j]==array[i][j+1]){
                    //최소 2개 연속 사탕이 채워진 경우
                    if(j+1==N-1) break;
                    else max = getCheckRow(i, j+1);
                }
            }
            //열 기준 비교
            for(int j=0;j<N;j++){

            }
        }
    }
    public static int getCheckRow(int x, int y){
        char color = array[x][y];
        boolean change = false;
        int count = 2;
        for(int i=y+1;i<N;i++){
            if(array[x][i]==color) count++;
            else{
                if(change){
                    if(array[x][i]!=color) break;
                    else count++;
                }
                if((x<N && array[x+1][i]==color) || (x>0 && array[x-1][i]==color)){
                    count += 1;
                    change = true;
                }
            }
        }
        return Math.max(max, count);
    }
}
