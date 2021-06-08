package lv2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> distribute = new ArrayList<>();
        List<Integer> work = new LinkedList<>();

        for(int i=0;i<progresses.length;i++){
            progresses[i] += speeds[i];
            if(progresses[i] >=100) work.set(i,)


        }
    }
}
