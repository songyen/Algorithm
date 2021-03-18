package lv1;

public class 시저암호 {
    public static void main(String[] args) {
        System.out.println(solution("a B z",4));
    }
    public static String solution(String s, int n) {
        String answer = "";

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(c >= 'A' && c <= 'Z') {
                if(c+n > 'Z') c = (char) (c+n-26);
                else c += n;
            }else if(c >= 'a' && c <= 'z'){
                if(c+n > 'z') c = (char) (c+n-26);
                else c += n;
            }
            answer += c;
        }
        return answer;
    }
}
