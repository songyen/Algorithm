package lv2;

public class 주식가격 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                answer[i]++;//몇 초간(기간)을 count
                if (prices[i] > prices[j])//몇 초뒤 가격이 떨어진다면, break
                    break;

            }
        }

        return answer;
    }
}
