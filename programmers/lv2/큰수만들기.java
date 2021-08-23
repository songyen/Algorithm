/*
* reference : https://jhhj424.tistory.com/32
 */
package lv2;

public class 큰수만들기 {
    public String solution(String number, int k){
        StringBuilder sb = new StringBuilder();
        int start = -1;
        for(int i=0;i<number.length()-k;i++){
            int max = 0;
            for(int j=start+1;j<=k+i;j++){
                if(max < number.charAt(j)-'0'){
                    max = number.charAt(j)-'0';
                    start = j;
                }
            }
            sb.append(max);
        }
        return sb.toString();
    }
}
