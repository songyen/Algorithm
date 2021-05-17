/*
* Programmers 월간코드챌린지 시즌2 No.1 (100/100)
 */
package Challenge;

public class Test4 {
    public static void main(String[] args) {
        System.out.println(solution(13,17));
    }
    public static int solution(int left, int right) {
        int sum = 0;
        for(int i=left;i<=right;i++) {
            if(even(i))sum+=i;
            else sum -= i;
        }
        return sum;
    }

    public static boolean even(int num){
        int count = 0;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                if(i*i==num) count++;
                else {
                    count++;
                    count++;
                }
            }
        }
        if(count%2==0) return true;
        else return false;
    }
}
