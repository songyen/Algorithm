package lv3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;

public class 단속카메라 {
    public class Car implements Comparable<단속카메라.Car>{
        int index;
        ArrayList<Integer> list;
        public Car(int index, ArrayList<Integer> list){
            this.index = index;
            this.list = list;
        }
        @Override
        public int compareTo(Car o) {
            return o.list.size() - this.list.size();
        }
    }
    public int solution(int[][] routes) {
        PriorityQueue<Car> priorityQueue = new PriorityQueue<>();
        for(int i=0;i<routes.length;i++){
            int end = routes[i][1];
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<routes.length;j++){
                if(i!=j && routes[j][0] <= end && end <= routes[j][1]){
                    list.add(j);
                }
            }
            priorityQueue.add(new Car(i, list));
        }

        HashSet<Integer> set = new HashSet<>();
        int camera = 0;
        while(!priorityQueue.isEmpty()){
            Car car = priorityQueue.poll();
            if(set.contains(car.index)){
                car.list.clear();
                continue;
            }else camera++;

            if(!car.list.isEmpty()) {
                for (int index : car.list) {
                    set.add(index);
                }
            }
        }
        return camera;
    }
}
