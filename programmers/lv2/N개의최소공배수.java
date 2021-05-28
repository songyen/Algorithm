package lv2;

import org.junit.Assert;
import org.junit.Test;


public class N개의최소공배수{
    public static void main(String[] args) {
        N개의최소공배수 test = new N개의최소공배수();
        System.out.println(test.solution(new int[]{2,6,8,14}));
    }
    public int solution(int[] arr){
        int a = arr[0];
        for(int i=1;i<arr.length;i++){
            a = findLCM(a, arr[i]);
        }
        return a;
    }

    public int findGCD(int a, int b){
        int r = a%b;
        if(r==0) return b;
        else return findGCD(b, r);
    }

    public int findLCM(int a, int b){

        int gcd = findGCD(a, b);
        return a*b/gcd;
    }




//    @Test
//    public void test(){
//        Assert.assertEquals(168, solution(new int[]{2, 6, 8, 14}));
//        Assert.assertEquals(6, solution(new int[]{1,2,3}));
//    }
}
