package lv1;

class 최대공약수와최소공배수_유클리드호제법 {
    //유클리드 호제법
    public int gcd(int a, int b){
        int r = a%b;
        if(r==0) return b;
        else return gcd(b,r);
    }

    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcd = gcd(n,m); //최대공약수
        answer[0] = gcd;
        answer[1] = gcd * (n/gcd) * (m/gcd); //최소공배수

        return answer;
    }
}