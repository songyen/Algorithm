/*
* reference : https://hyeon9mak.github.io/Java-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EA%B8%B0%EB%8A%A5%EA%B0%9C%EB%B0%9C/
 */

package lv2;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> days = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();
        for(int i=0;i<progresses.length;i++){
            //배포 예정날짜(몇일 후)
            int deploy = (int)Math.ceil((100-progresses[i])/(double)speeds[i]);
            //큐가 비어있지 않고, 큐의 가장 앞의 작업일이 현재 구한 작업일보다 작은경우
            if(!days.isEmpty() && days.peek() < deploy){
                answer.add(days.size());//큐 길이 저장(하루에 배포하는 기능 수)
                days.clear();//큐 비우기(배포 완료)
            }
            //큐에 현재 구한 작업일 삽입
            days.add(deploy);
        }
        answer.add(days.size());//마지막 큐의 길이 저장

        int[] result = new int[answer.size()];
        for(int i=0;i<answer.size();i++){
            result[i] = answer.get(i);
        }

        return result;
    }

    @Test
    public void test(){
        Assert.assertArrayEquals(new int[]{2,1},solution(new int[]{93,30,55}, new int[]{1,30,5}));
    }
}
