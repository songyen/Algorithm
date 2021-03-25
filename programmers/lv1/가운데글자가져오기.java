package lv1;

public class 가운데글자가져오기 {
    public static void main(String[] args) {
        System.out.println(solution("abcde"));
    }
    public static String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        if(s.length()%2==0){
            answer = arr[s.length()/2-1]+ arr[s.length()/2];
        }else{
            answer = arr[s.length()/2];
        }
        return answer;
    }
}
