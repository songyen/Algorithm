package lv2;

public class 조이스틱 {
    public static void main(String[] args) {
        System.out.println(solution("ZAAAZZZZZZZ"));
    }

    static StringBuilder sb = new StringBuilder();
    static int answer = 0;
    public static int solution(String name) {
        for(int i=0;i<name.length();i++){
            sb.append("A");
        }

        int lastIndex = 0;
        //첫 시작은 첫번째 인덱스에 커서 위치함
        if(name.charAt(lastIndex)!='A'){
            //알파벳 조이스틱 이동
            getAlphabet(lastIndex, name);
        }

        while(!sb.toString().equals(name)){
            //커서 조이스틱 이동(A가 아닌 가장 가까운 인덱스 찾기)
            lastIndex = getCursor(lastIndex, name);
            //알파벳 조이스틱 이동
            getAlphabet(lastIndex, name);
        }
        return answer;
    }

    private static void getAlphabet(int i, String name) {
        if(name.charAt(i)-'A' < 'Z'-name.charAt(i)+1) answer += name.charAt(i)-'A';
        else answer += 'Z'-name.charAt(i)+1;

        sb.setCharAt(i,name.charAt(i));
    }

    private static int getCursor(int lastIndex, String name) {
        int right = 1;
        if(lastIndex==name.length()-1) right = 0;

        for(int i=lastIndex+1;i<name.length();i++){
            if(sb.charAt(i) != name.charAt(i) && name.charAt(i) != 'A') break;
            else right++;
        }

        int left = 1;
        for(int i=lastIndex-1;;i--){
            if(i<0) i = name.length()-1;

            if(sb.charAt(i) != name.charAt(i) && name.charAt(i) != 'A') break;
            else left++;
        }

        if(right == 0){
            //left로 가줘야함
            answer+=left;
            if(lastIndex-left<0) return name.length()-(Math.abs(lastIndex-left));
            else return lastIndex-left;
        }

        if(right<=left) {
            //right==left일 경우, 오른쪽이 우선되게 풀어야함.
            answer+=right;
            return lastIndex+right;
        }else{
            answer+=left;
            if(lastIndex-left<0) return name.length()-(Math.abs(lastIndex-left));
            else return lastIndex-left;
        }
    }
}
