package lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                sum = numbers[i] + numbers[j];
                if(!list.contains(sum)) list.add(sum);
            }
        }

        Collections.sort(list);

        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
