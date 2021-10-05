package lv3;

public class 정수삼각형 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}}));
    }
    public static int solution(int[][] triangle) {
        if(triangle.length==1) return triangle[0][0];

        for(int i=0;i<triangle.length-1;i++){
            int len = triangle[i+1].length;
            triangle[i+1][0] += triangle[i][0];
            triangle[i+1][len-1] += triangle[i][len-2];
            for(int j=1;j<len-1;j++){
                triangle[i+1][j] += Math.max(triangle[i][j-1], triangle[i][j]);
            }
        }
        int row = triangle.length-1;
        int answer = 0;
        for(int i=0;i<triangle[row].length;i++){
            answer = Math.max(answer, triangle[row][i]);
        }
        return answer;
    }
}
