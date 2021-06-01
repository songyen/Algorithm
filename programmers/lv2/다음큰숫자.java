package lv2;

import org.junit.Assert;
import org.junit.Test;

public class 다음큰숫자 {
    public int solution(int n) {
        int bitCount =Integer.bitCount(n);
        for(int i=n+1;;i++){;//n보다 큰 수의 (2진수일 때) 1의 개수
            if(bitCount == Integer.bitCount(i)) {
                return i;
            }
        }
    }

    @Test
    public void test(){
        Assert.assertEquals(83, solution(78));
    }
}
