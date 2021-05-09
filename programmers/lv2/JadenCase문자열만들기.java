//package lv2;
//
//public class JadenCase문자열만들기 {
//    public static void main(String[] args) {
//        System.out.println(solution("1tart   you makyoue you    end"));
//    }
//    public static String solution(String s) {
//        s = s.toLowerCase();
//        String[] word = s.split("[\\s]+"); //공백문자가 1개 이상인 기준으로 split
//        StringBuilder sb = new StringBuilder();
//        String answer = "";
//        String eachWord = "";
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i) == ' ')
//            else{
//                eachWord = word[i];
//                eachWord = eachWord.replaceFirst(String.valueOf(word[i].charAt(0)), String.valueOf(word[i].charAt(0)).toUpperCase());
//                answer += eachWord;
//            }
//        }
//
//        return answer;
//    }
//}
