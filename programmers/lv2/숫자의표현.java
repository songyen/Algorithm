package lv2;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class 숫자의표현 {
    public int solution(int n) {
        int answer = 1;
        int sum = 0;
        List<Integer> list = new LinkedList<>();
        for(int i=n/2+1;i>=1;i--){
            list.add(i);
            sum += i;
            if(sum > n){
                sum -= list.remove(0);
            }else if(sum == n){
                answer++;
                sum -= list.remove(0);
            }else{
                continue;
            }
        }

        return answer;
    }

    @Test
    public void test(){
        Assert.assertEquals(4,solution(15));
    }
}
