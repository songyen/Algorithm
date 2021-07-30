package lv3;

import java.util.*;

public class 디스크컨트롤러 {
    public int solution(int[][] jobs) {
        Queue<Job> queue = new LinkedList<>();
        Arrays.sort(jobs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];//요청시간이 짧은 순
            }
        });

        for(int i=0;i<jobs.length;i++){
            queue.add(new Job(jobs[i][0],jobs[i][1]));//요청시간이 짧은 순서대로 대기 큐에 작업들이 삽입됨
        }

        PriorityQueue<Job> priorityQueue = new PriorityQueue<>(new Comparator<Job>() {
            @Override
            public int compare(Job o1, Job o2) {
                return o1.durOfJob - o2.durOfJob;//작업 소요시간 짧은 것 부터 먼저 실행
            }
        });

        int time = queue.peek().reqTime;
        int cnt = 0;//완료된 작업수수
        int answer = 0;
        while(cnt < jobs.length){
            while(!queue.isEmpty() && queue.peek().reqTime <= time){
                priorityQueue.offer(queue.poll());
            }

            if(!priorityQueue.isEmpty()){
                Job job = priorityQueue.poll();
                time += job.durOfJob;//작업완료된 직후 시간(현재시간)
                answer += time - job.reqTime;//요청부터 종료까지 걸린 시간
                cnt++;
            }else{
                time++;
            }


        }
        return answer/jobs.length;
    }

    public class Job{
        private int reqTime;
        private int durOfJob;

        public Job(int reqTime, int durOfJob){
            this.reqTime = reqTime;
            this.durOfJob = durOfJob;
        }
    }
}
