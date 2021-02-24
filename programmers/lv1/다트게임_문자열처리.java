package lv1;

import java.util.HashMap;

class 다트게임_문자열처리 {
    public int solution(String dartResult) {
        int answer = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('S',1);
        map.put('D',2);
        map.put('T',3);
        char[] arr = new char[dartResult.length()];

        //입력문자열 한 글자씩 분리
        for(int i=0;i<dartResult.length();i++){
            arr[i]=dartResult.charAt(i);
        }

        int[] eachScore = new int[3];
        int chance = 0; //총 3번의 기회
        String c ="";
        int score = 0;

        for(int i=0;i<dartResult.length();i++){
            //숫자일 경우, 10점도 고려하기 위해 문자열에 입력
            if(arr[i] >='0' && arr[i]<='9'){
                c += arr[i];
            }else if(arr[i]=='S' || arr[i]=='D' || arr[i]=='T'){  //보너스일 경우, c는 정수 score로 변환
                score = Integer.parseInt(c);
                eachScore[chance++] = (int)Math.pow(score,map.get(arr[i]));
                c = ""; //c 초기화
            }
            else{ //옵션일 경우
                if(arr[i] == '*'){
                    if(chance-1 > 0) eachScore[chance-2] *= 2; //첫 기회가 아닌 경우, 이전 점수도 2배
                    eachScore[chance-1] *= 2;
                }else{
                    eachScore[chance-1] *= -1;
                }
            }
        }
        answer = eachScore[0] + eachScore[1] + eachScore[2];
        return answer;
    }
}