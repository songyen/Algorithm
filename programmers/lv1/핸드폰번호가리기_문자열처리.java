package lv1;

class 핸드폰번호가리기_문자열처리 {
    public String solution(String phone_number) {
        String answer = "";
        for(int i=0;i<phone_number.length();i++){
            if(i<phone_number.length()-4) answer += "*";
            else answer += phone_number.charAt(i);
        }
        return answer;
    }
}