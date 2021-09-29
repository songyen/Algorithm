/*
* reference : https://programmers.co.kr/questions/14636
 */
package lv3;

import java.util.*;


public class 단속카메라 {
    public int solution(int[][] routes) {
        List<int[]> list = new ArrayList<>();//최소 한번 촬영된 차량
        for(int[] route : routes){
            list.add(route);
        }

        Collections.sort(list, (o1, o2) -> o1[1] - o2[1]);
        int camera = 0;
        while(!list.isEmpty()){
            int position = list.get(0)[1];//가장 빠른 진출지점
            camera++;
            for(int i=0;i<list.size();i++){
                if(list.get(i)[0]<=position){
                    list.remove(i);
                    i--;
                }
            }
        }
        return camera;
    }
}
