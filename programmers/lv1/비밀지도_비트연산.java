package lv1;

class 비밀지도_비트연산 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0;i<n;i++){
            String tmp = Integer.toBinaryString(arr1[i] | arr2[i]);
            tmp = String.format("%"+n+"s",tmp);
            tmp = tmp.replaceAll("1","#");
            tmp = tmp.replaceAll("0"," ");
            answer[i] = tmp;
        }

        return answer;
    }
}