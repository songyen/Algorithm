package lv2;

public class 피보나치수 {
    public int solution(int n) {
        int result = 0;
        int a = 1;
        int b = 1;
        if(n==1 || n==2) return 1;
        else{
            for(int i=3;i<=n;i++){
                result = (a + b)%1234567;
                a = b;
                b = result;
            }
            return result;
        }
    }
}
