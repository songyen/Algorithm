package lv1;

import java.util.Arrays;

public class k번째수 {
    public static void main(String[] args) {
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        for(int i: solution(new int[]{1,5,2,6,3,7,4},commands)){
            System.out.println(i);
        }
    }
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0;i<commands.length;i++){
                int[] copyArray = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);  //from부터 to-1 인덱스까지 복사
                Arrays.sort(copyArray);
                answer[i] = copyArray[commands[i][2] - 1];
        }
        return answer;
    }
}
