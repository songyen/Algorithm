package lv1;

public class 문자열다루기기본 {
    public static void main(String[] args) {
        System.out.println(solution("a1234"));
    }
    public static boolean solution(String s) {
        boolean answer = true;
        try{
            if(s.length() != 4 && s.length() != 6)  answer = false;
            int num = Integer.parseInt(s);
        }catch(NumberFormatException e){
            answer = false;
        }
        return answer;
    }
}
