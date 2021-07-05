package lv2;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class 전화번호목록 {
    public boolean solution(String[] phone_book) {
        HashSet<String> set = new HashSet<>();

        for(String num : phone_book){
            set.add(num);
        }

        for(String num : phone_book){
            for(int i=1;i<num.length();i++){
                String temp = num.substring(0,i);

                if(set.contains(temp)) return false;
            }
        }
        return true;
    }

    @Test
    public void test(){
        Assert.assertEquals(false, solution(new String[]{"119", "97674223", "1195524421"}));
    }
}
