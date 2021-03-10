package lv1;

public class 제일작은수제거하기_배열 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.print("{");
        for(int num : solution(arr)){
            System.out.println(num+",");
        }
        System.out.println("}");
    }
    public static int[] solution(int[] arr) {
        int min = arr[0];
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }else{
            //최소값 구하기
            for(int i=1;i<arr.length;i++){
                min = Math.min(min,arr[i]);
            }

            int index=0;
            int[] answer = new int[arr.length-1];
            for(int i=0;i<arr.length;i++){
                if(arr[i] != min){
                    answer[index++] = arr[i];
                }
            }
            return answer;
        }
    }
}
