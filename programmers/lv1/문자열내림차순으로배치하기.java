package lv1;

import java.util.Arrays;

public class 문자열내림차순으로배치하기 {
    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }
    public static String solution(String s) {
        String answer = "";
        char[] array = new char[s.length()];
        for(int i=0;i<s.length();i++){
            array[i] = s.charAt(i);
        }
        Arrays.sort(array);
        for(int i=array.length-1;i>=0;i--){
            answer += array[i];
        }
        return answer;
    }
}
