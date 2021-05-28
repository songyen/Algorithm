package lv2;

import org.junit.Assert;
import org.junit.Test;

public class 행렬의곱셈 {
    private int[][] array1;
    private int[][] array2;
    public int[][] solution(int[][] arr1, int[][] arr2) {
        array1 = arr1;
        array2 = arr2;
        int[][] answer = new int[arr1.length][arr2[0].length];

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                answer[i][j] += calculate(i,j);
            }
        }
        return answer;
    }

    public int calculate(int i, int j){
        int result = 0;
        for(int k=0;k<array2.length;k++){
            result += array1[i][k] * array2[k][j];
        }
        return result;
    }

    @Test
    public void test(){
        int[][] result = {{15,15},{15,15},{15,15}};
        Assert.assertEquals(result, solution(new int[][]{{1,4},{3,2},{4,1}},new int[][]{{3,3},{3,3}}));
    }
}
