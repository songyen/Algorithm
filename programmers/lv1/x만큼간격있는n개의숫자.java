package lv1;

class x만큼간격있는n개의숫자 {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        long num = x;
        for(int i=0;i<n;i++){
            answer[i] = x;
            x += num;
        }
        return answer;
    }
}