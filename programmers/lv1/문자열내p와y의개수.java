package lv1;

public class 문자열내p와y의개수 {
    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
    }
    static boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int p = 0;
        int y = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'p') p++;
            if(s.charAt(i) == 'y') y++;
        }

        if(p != y) answer = false;

        return answer;
    }
}
