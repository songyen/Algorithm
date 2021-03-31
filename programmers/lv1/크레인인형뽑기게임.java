/*
*reference : https://velog.io/@ajufresh/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%ED%81%AC%EB%A0%88%EC%9D%B8-%EC%9D%B8%ED%98%95%EB%BD%91%EA%B8%B0-%EA%B2%8C%EC%9E%84-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-Java
 */
package lv1;

import java.util.*;

public class 크레인인형뽑기게임 {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println(solution(board, moves));
    }

    //stack이용한 풀이. stack.peek()비교후 stack.pop() or stack.push()하는 방법으로 풀이.
    public static int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int count = 0;

        for(int move : moves){
            for(int i=0;i<board.length;i++){
                if(board[i][move-1] != 0){
                    if(stack.peek() == board[i][move-1]){
                        stack.pop();
                        count += 2;
                    }else{
                        stack.push(board[i][move-1]);
                    }

                    board[i][move-1] = 0;
                    break;
                }
            }
        }

        return count;
    }

    /*
    //list이용한 풀이, box에 넣고 비교후 삭제하는 방법으로 풀이.
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
    }*/
}
