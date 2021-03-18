package lv1;

import java.util.ArrayList;

public class 소수찾기 {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }
    public static int solution(int n){
        int answer = 0;
        ArrayList<Integer> primeList = new ArrayList<>(n+1);

        primeList.add(0);
        primeList.add(0);  //0과 1은 소수 아님으로 처리

        //2부터 n까지는 소수로 처리
        for(int i=2;i<=n;i++){
            primeList.add(1);
        }

        for(int i=2;i*i<=n;i++){  //n의 제곱근보다 작은 소수까지 판별
            if(primeList.get(i) == 1)  //소수라면,
                for(int j=i*i;j<=n;j+=i) primeList.set(j,0); //소수의 배수를 지운다 (i*i 미만은 이미 처리되었으므로, j의 시작값은 i*i로 최적화할 수 있다.)
        }

        for(int i=0;i<=n;i++){
            if(primeList.get(i) == 1) answer++;
        }
        return answer;
    }
}
