package lv1;

import java.util.*;

public class 로또의최고순위와최저순위 {
    public static void main(String[] args) {
        for(int i : solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19})){
            System.out.println(i);
        }
    }
    public static int[] solution(int[] lottos, int[] win_nums) {
        List<Integer> winNums = new ArrayList<>();
        for(int i=0;i<win_nums.length;i++){
            winNums.add(Integer.valueOf(win_nums[i]));
        }

        int unRegonizable = 0;
        int correct = 0;
        for(int i=0;i< lottos.length;i++){
            if(winNums.contains(lottos[i])) correct++;
            if(lottos[i] == 0) unRegonizable++;
        }

        return rank(correct+unRegonizable, correct);
    }

    public static int[] rank(int max, int min){
        int[] result = new int[2];
        HashMap<Integer, Integer> rank = new HashMap<>();
        rank.put(6,1);
        rank.put(5,2);
        rank.put(4,3);
        rank.put(3,4);
        rank.put(2,5);
        rank.put(0,6);

        if(max < 2) max = 0;
        if(min < 2) min = 0;

        result[0] = rank.get(max);
        result[1] = rank.get(min);

        return result;
    }
}
