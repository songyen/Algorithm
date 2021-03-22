package lv1;

import java.util.Arrays;

public class 문자열내마음대로정렬하기 {
    public static void main(String[] args) {
        String[] strings = {"sun","bed","car"};
        for(String s : solution(strings,1)){
            System.out.print(s+" ");
        }
    }
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (o1, o2) -> {
            char c1 = o1.charAt(n);
            char c2 = o2.charAt(n);
            if(c1 == c2){
                //인덱스 n의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치
                return o1.compareTo(o2);
            }
            return Character.compare(c1, c2);
        });
        return strings;
    }
}
