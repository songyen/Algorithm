package 그래프탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 연산자끼워넣기 {
    private static int N;
    private static int[] operator = new int[4];
    private static int[] operand;
    private static int result = 0;
    private static ArrayList<Integer> answer = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0;i<4;i++){
            int op = Integer.parseInt(st2.nextToken());
            if(op!=0) operator[i]=op;
        }
        operand = new int[N];
        for(int i=0;i<N;i++){
            operand[i] = Integer.parseInt(st1.nextToken());
        }
        dfs(operand[0], 1);//연산결과 operand[0], 피연산자개수 1
        Collections.sort(answer);
        System.out.println(answer.get(answer.size()-1));
        System.out.println(answer.get(0));
    }

    public static void dfs(int result, int cnt){
        if(cnt==N){
            answer.add(result);
            return;
        }
        for(int i=0;i<4;i++){
            if(operator[i]!=0){
                operator[i]--;
                if(i==0) dfs(result+operand[cnt], cnt+1);
                else if(i==1) dfs(result-operand[cnt], cnt+1);
                else if(i==2) dfs(result*operand[cnt], cnt+1);
                else{
                    if(result<0){
                        result*=-1;
                        dfs(result/operand[cnt]*-1,  cnt+1);
                    }else dfs(result/operand[cnt], cnt+1);
                }
                operator[i]++;
            }
        }
    }
}
