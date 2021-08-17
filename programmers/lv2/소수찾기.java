package lv2;

import java.util.*;

public class 소수찾기 {
    static HashSet<Integer> numSet = new HashSet<>();
    static HashSet<Integer> firstNum = new HashSet<>();
    static String[] str;
    static int depth;
    static boolean[] visited;
    static String tmp;
    static boolean[] primeList;

    public static void main(String[] args) {
        System.out.println(solution("0111111"));
    }
    public static int solution(String numbers) {
        str = numbers.split("");
        visited = new boolean[str.length];
        depth = str.length;
        bt(0);

        List<Integer> list = new ArrayList<>(numSet);
        Collections.sort(list, Comparator.reverseOrder());
        getPrime(list.get(0));
        int answer = 0 ;
        for(int i : numSet){
            if(primeList[i]) {
                answer++;
            }
        }
        return answer;
    }

    private static void getPrime(int n) {
        primeList = new boolean[n+1];
        for(int i=2;i<=n;i++){
            primeList[i] = true;//2부터 n까지 소수로 임시 처리
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(primeList[i]) {//소수라면
                for (int j = i * i; j <= n; j += i) {//그 소수의 배수는 소수가 아니다.
                    primeList[j] = false;//소수아님
                }
            }
        }
    }

    private static void bt(int cnt) {
        if(cnt == depth) return;

        for(int i=0;i<depth;i++){
            if(!visited[i]) {
                if(cnt==0) {
                    tmp = "";
                    if(!firstNum.contains(str[i])) firstNum.add(Integer.parseInt(str[i]));
                    else continue;
                }
                visited[i] = true;
                tmp += str[i];
                numSet.add(Integer.parseInt(tmp));
                bt(cnt+1);
                visited[i] = false;
                tmp = tmp.substring(0, cnt);
            }
        }
    }
}
