package lv1;

class 비밀지도_비트연산 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[] map = new int[n];
        for(int i=0;i<n;i++){
            map[i] = arr1[i] | arr2[i];
        }

        for(int i=0;i<n;i++){
            answer[i] = "";
            for(int j=1<<n-1;j>=1; j = j>>1){
                if((map[i] & j) == j){
                    answer[i] += "#";
                }
                else{
                    answer[i] += " ";
                }
            }
        }

        return answer;
    }
}