/*
* references: https://wooaoe.tistory.com/40
 */
package lv1;

public class 이상한문자만들기_문자열 {
    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }
    public static String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int cnt =0;

        for(int i=0;i<arr.length;i++){
            if(arr[i].isBlank()){
                cnt = 0;
            }else{
                if(cnt%2==0) arr[i] = arr[i].toUpperCase();
                else arr[i] = arr[i].toLowerCase();
                cnt++;
            }
            answer += arr[i];
        }
        return answer;
    }
}
