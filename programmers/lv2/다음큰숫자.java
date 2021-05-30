package lv2;

import org.junit.Assert;
import org.junit.Test;

public class 다음큰숫자 {
    public int solution(int n) {
        int num = binary(n);
        for(int i=n+1;;i++){;//n보다 큰 수의 (2진수일 때) 1의 개수
            if(num == binary(i)) {
                return i;
            }
        }
    }

    private int binary(int n){//2진수일 때, 1의 개수 구하기
        String[] strings = Integer.toBinaryString(n).split("");

        int num = 0;
        for(String s : strings){
            if(s.equals("1")) num++;
        }
        return num;
    }

    @Test
    public void test(){
        Assert.assertEquals(83, solution(78));
    }
}
