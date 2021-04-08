package lv2;

import java.util.Arrays;

public class n진수게임 {
    public static void main(String[] args) {
        System.out.println(solution(11,8,5,4));
    }
    public static String solution(int n, int t, int m, int p) {
        String[] array = new String[t*m];
        int findNum = n;
        String num = Integer.toString(findNum,n);

        for(int i=0;i<array.length;i++){
            if(i<n){
                array[i] = Integer.toString(i, n).toUpperCase();
            }else{
                array[i] = Character.toString(num.charAt(0));
                if (num.length() == 1) num = Integer.toString(++findNum, n).toUpperCase();
                else num = num.substring(1);

            }
        }

        String result = "";
        int answer = 0;
        for(int i=0;i<array.length;i++){
            if(i%m == p-1 && answer != t) {
                result += array[i];
                answer++;
            }
            if(answer == t) break;
        }

        return result;
    }
}
