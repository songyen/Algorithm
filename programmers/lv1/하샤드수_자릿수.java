package lv1;

class 하샤드수_자릿수 {
    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        int tmp = x;
        while(tmp>0){
            sum += tmp%10;
            tmp/=10;
        }

        if(x%sum==0) answer = true;

        return answer;
    }
}