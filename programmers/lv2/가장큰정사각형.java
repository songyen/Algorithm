/*
* reference : https://soobarkbar.tistory.com/164
 */
package lv2;

public class 가장큰정사각형 {
    public int solution(int [][]board){
        int max = 0;
        for(int i=1;i<board.length;i++){
            for(int j=1;j<board[0].length;j++){
                if(board[i][j] == 1){
                    board[i][j] = Math.min(Math.min(board[i-1][j],board[i][j-1]),board[i-1][j-1])+1;
                }
                if(board[i][j] > max) max = board[i][j];
            }
        }
        if(max == 0){
            for(int i : board[0]){
                if(i == 1) max = 1;
            }
            for(int i=1;i<board.length;i++){
                if(board[i][0] == 1) max = 1;
            }
            return max*max;
        }else return max*max;
    }
}
