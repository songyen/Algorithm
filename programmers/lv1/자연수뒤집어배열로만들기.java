package lv1;

public class 자연수뒤집어배열로만들기 {
    public static void main(String[] args) {
        int[] arr = solution(12345);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static int[] solution(long n) {
        String[] s = String.valueOf(n).split("");

        int[] answer = new int[s.length];
        int index=0;
        for(int i=s.length-1;i>=0;i--){
            answer[index++] = Integer.parseInt(s[i]);
        }
        return answer;
    }
}
