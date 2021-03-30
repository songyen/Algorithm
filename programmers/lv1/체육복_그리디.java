package lv1;

public class 체육복_그리디 {
    public static void main(String[] args) {
        System.out.println(solution(5,new int[]{2,4},new int[]{1,3,5}));
    }
    public static int solution(int n, int[] lost, int[] reserve) {
        int[] answer = new int[n+2];
        answer[0] = -1;
        answer[n+1] = -1;
        for(int i=1;i<=n;i++){
            answer[i] = 1;
        }
        for(int i=0;i<reserve.length;i++){
            answer[reserve[i]] = 2;
        }
        for(int i=0;i<lost.length;i++){
            answer[lost[i]]--;
        }

        for(int i=1;i<=n;i++){
            if(answer[i] == 0){
                if(answer[i-1] == 2){ //앞 번호가 빌려줌
                    answer[i]++;
                    answer[i-1]--;
                }else if(answer[i+1] == 2){ //뒷 번호가 빌려줌
                    answer[i]++;
                    answer[i+1]--;
                }
            }
        }
        int cnt = 0;
        for(int i=1;i<=n;i++){
            if(answer[i] >= 1) cnt++;
        }
        return cnt;
    }
}
