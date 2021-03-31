package lv1;

import java.util.*;

public class 크레인인형뽑기게임 {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println(solution(board, moves));
    }
    public static int solution(int[][] board, int[] moves) {
        List<Integer> list = new ArrayList<>();
        int size;
        int count = 0;

        for(int i=0;i<moves.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[j][moves[i]-1] != 0){
                    list.add(board[j][moves[i]-1]);
                    board[j][moves[i]-1] = 0;
                    if(list.size() > 1){
                        size = list.size();
                        if(list.get(size-2) == list.get(size-1)){
                            list.remove(size-1);
                            list.remove(list.size()-1);
                            count += 2;
                        }
                    }
                    break;
                }
            }
        }

        return count;
    }
}
