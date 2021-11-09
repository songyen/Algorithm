package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평균 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int max = Integer.MIN_VALUE;
        double[] scores = new double[num];
        for(int i=0;i<num;i++){
            int score = Integer.parseInt(st.nextToken());
            scores[i] = score;
            max = max<score ? score : max;
        }
        double sum = 0;
        for(int i=0;i<num;i++){
            if(scores[i] !=0) {
                scores[i] = scores[i] / max * 100;
                sum += scores[i];
            }
        }
        System.out.println(sum/num);
    }
}
