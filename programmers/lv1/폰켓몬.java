package lv1;

import java.util.ArrayList;
import java.util.List;

public class 폰켓몬 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,1,2,3}));
    }
    public static int solution(int[] nums) {
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(!list.contains(nums[i])) list.add(nums[i]);
        }

        int type = list.size();
        int pick = nums.length/2;
        int result = 0;

        if(type>pick) result = pick;
        else result = type;

        return result;
    }
}
