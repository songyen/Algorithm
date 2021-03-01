/*
*references : https://moon1226.tistory.com/42
 */
package lv1;

import java.util.*;

class 실패율 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] notClear = new int[N];
        Fail[] fails = new Fail[N];

        for(int i=0;i<stages.length;i++){
            if(stages[i]==N+1) continue;
            else notClear[stages[i]-1]++;
        }

        int t = stages.length;
        for(int i=0;i<N;i++){
            if (notClear[i] == 0 || t ==0) {
                fails[i] = new Fail(i + 1, 0);
            }
            if(notClear[i] != 0) {
                fails[i] = new Fail(i + 1, (double)notClear[i] / t);
            }
            t -= notClear[i];
        }

        Arrays.sort(fails,(o1, o2) -> Double.compare(o2.rate, o1.rate));

        for(int i=0; i<N; i++){
            answer[i] = fails[i].stage;
            System.out.println(answer[i]);
        }
        return answer;
    }

    public static class Fail{
        private int stage;
        private double rate;
        Fail(int stage, double rate){
            this.stage = stage;
            this.rate = rate;
        }
    }
}