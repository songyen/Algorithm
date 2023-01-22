package 기하;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 참외밭 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int melon = Integer.parseInt(br.readLine());
        int[] arr = new int[6];
        int maxWidth = 0;
        int maxWidthIdx = 0;
        int maxHeight = 0;
        int maxHeightIdx = 0;
        StringTokenizer st;
        for(int i=0;i<6;i++){
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            arr[i] = Integer.parseInt(st.nextToken());
            //가장 긴 가로변 길이
            if((d==1 || d==2) && maxWidth < arr[i]) {
                maxWidth = arr[i];
                maxWidthIdx = i;
            }
            //가장 긴 세로변 길이
            if((d==3 || d==4) && maxHeight < arr[i]) {
                maxHeight = arr[i];
                maxHeightIdx = i;
            }
        }
        int right = 0;
        int left = 0;

        if(maxWidthIdx == 0) left = 5;
        else left = maxWidthIdx-1;
        if(maxWidthIdx == 5) right = 0;
        else right = maxWidthIdx+1;
        //가장 긴 가로변 양옆의 세로변 차이가 공백의 세로변
        int blankHeight = Math.abs(arr[left]-arr[right]);

        if(maxHeightIdx == 0) left = 5;
        else left = maxHeightIdx-1;
        if(maxHeightIdx == 5) right = 0;
        else right = maxHeightIdx+1;
        //가장 긴 세로변 양옆의 가로변 차이가 공백의 가로변
        int blankWidth = Math.abs(arr[left]-arr[right]);

        System.out.println(((maxWidth*maxHeight) - (blankWidth*blankHeight)) * melon);
    }
}
