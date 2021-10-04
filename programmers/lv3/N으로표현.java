/*
* reference : https://dheldh77.tistory.com/entry/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-N%EC%9C%BC%EB%A1%9C-%ED%91%9C%ED%98%84
 */
package lv3;

import java.util.HashSet;

public class N으로표현 {
    public int solution(int N, int number) {
        if(N==number) return 1;

        int answer = -1;
        HashSet<Integer>[] setArr = new HashSet[9];
        for(int i=0;i<setArr.length;i++){
            setArr[i] = new HashSet<>();
        }
        setArr[1].add(N);
        int n = N;
        for(int i=2;i<=8;i++){
            n = n*10 + N;
            setArr[i].add(nn);
            for(int j=1;j<=i-1;j++){
                for(int op1 : setArr[j]){
                    for(int op2 : setArr[i-j]){
                        setArr[i].add(op1+op2);
                        setArr[i].add(op1-op2);
                        setArr[i].add(op1*op2);
                        if(op2!= 0) setArr[i].add(op1/op2);
                    }
                }
            }
            if(setArr[i].contains(number)) {
                answer = i;
                break;
            }
        }
        return answer;


    }
}