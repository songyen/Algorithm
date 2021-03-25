package lv1;

public class 삼진법뒤집기 {
    public static void main(String[] args) {
        System.out.println(solution(45));
    }
    public static int solution(int n) {
        String ternary = Integer.toString(n, 3);//문자를 3진수로 바꾸고 문자열로 반환한다
        String reverse = "";
        for(int i=ternary.length()-1;i>=0;i--){
            reverse += ternary.charAt(i);
        }
        return Integer.parseInt(reverse,3);//3진수로 이뤄진 문자열을 10진수로 변환한다 default radix는 10진수로 이뤄진 문자열을 10진수로 변환하는 것
    }
}
