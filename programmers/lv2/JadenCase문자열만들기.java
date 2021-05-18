/*
* reference : https://velog.io/@ajufresh/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-JadenCase-%EB%AC%B8%EC%9E%90%EC%97%B4-%EB%A7%8C%EB%93%A4%EA%B8%B0-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-Java
 */
package lv2;

import org.junit.Assert;
import org.junit.Test;

public class JadenCase문자열만들기 {
    public static String solution(String s) {
        s = s.toLowerCase();
        StringBuilder answer = new StringBuilder();

        String firstStr = s.charAt(0) + "";
        answer.append(firstStr.toUpperCase()); // 첫 글자는 무조건 대문자

        for (int i = 1; i < s.length(); i++) {
            String now = s.charAt(i) + "";
            if (now.equals(' ')) { // 공백이면 그대로 넘어가기
                answer.append(" ");
            }else if (s.charAt(i - 1) == ' ') { // 전 문자열이 공백이면
                answer.append(now.toUpperCase()); // 대문자
            }else{
                answer.append(now);
            }
        }
        return answer.toString();
    }

    @Test
    public void 정답(){
        Assert.assertEquals("3people Unfollowed Me", solution("3people unFollowed me"));
    }
}
