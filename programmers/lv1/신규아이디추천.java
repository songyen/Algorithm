package lv1;

public class 신규아이디추천 {
    public static void main(String[] args) {
        String name = "...!@BaT#*..y.abcdefghijklm";
        System.out.println(solution(name));
    }
    public static String solution(String new_id) {
        new_id = new_id.toLowerCase(); //1단계 - 소문자
        new_id = new_id.replaceAll("[^a-z0-9_.-]",""); //2단계 - 소문자, 일부 특수기호만 사용 가능
        new_id = new_id.replaceAll("[.]{2,}","."); //3단계 - . 2번이상 반복 불가
        new_id = new_id.replaceAll("^[.]|[.]$",""); //4단계 . 처음이나 끝에 위치하면 제거

        if(new_id.isEmpty()) new_id = "a"; //5단계 - 빈 문자열이라면, a를 대입
        if(new_id.length() > 15){  //6단계 - 16자이상이라면, 첫 15개의 문자를 제외한 나머지 문자들 제거. 만약, 제거후 마지막 문자가 마침표(.) 이라면 마침표 제거
            new_id = new_id.substring(0,15);
            new_id = new_id.replaceAll("[.]$","");
        }
        if(new_id.length() < 3){ //7단계 - 2자 이하라면, 마지막 문자를 문자열 길이가 3일 될때까지 반복해서 끝에 붙인다
            char lastChar = new_id.charAt(new_id.length()-1);
            while(new_id.length() != 3) {
                new_id += lastChar;
            }
        }
        return new_id;
    }
}
