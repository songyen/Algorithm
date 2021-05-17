/*
 * Programmers 월간코드챌린지 시즌2 No.1 (54.6/100)
 */
package Challenge;

public class Test5 {
    public static void main(String[] args) {
        for(long l : solution(new long[]{2,7})){
            System.out.println(l);
        }
    }
    public static long[] solution(long[] numbers){
        long[] answer = new long[numbers.length];
        for(int i=0;i< numbers.length;i++){
            answer[i] = function((int)numbers[i]);
        }
        return answer;
    }
    public static int function(int x){
        for(int i=x+1; ;i++){
            if(diff(Integer.toBinaryString(x^i))==3) continue;
            else return i;
        }
    }

    public static int diff(String xor){
        int d = 0;
        for(int i=0;i<xor.length();i++){
            if(xor.charAt(i)=='1') d++;
        }
        if(d<=2) return 2;
        else return 3;
    }
}
