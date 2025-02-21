/*
Leo는 모든 음식의 스코빌 지수를 K 이상으로 만들고 싶음
스코빌 지수가 가장 낮은 두 개의 음식
섞음 = 가장 맵지 않은 음식의 스코빌 + 두 번째로 맵지 않은 음식의 스코빌 

모든 음식의 스코빌 지수가 K 이상이 될 때 까지 반복하여 섞음
모든 음식의 스코빌 지수를 K 이상으로 만들기 위한 최소 횟수 
*/

import java.util.*;

class Solution {
    static PriorityQueue<Integer> pq;
    static int count;
    
    public void calc(int food1, int food2){
        int sum = food1 + (food2 * 2);
        count++;
        pq.offer(sum);
    }
    
    public int solution(int[] scoville, int K) {
        count = 0;
        pq = new PriorityQueue<>();
        int size = scoville.length;
        
        for (int i = 0; i < size; i++){
            pq.offer(scoville[i]);
        }
        
        while(pq.peek() < K){
            if(pq.size() >= 2){
                int poll1 = pq.poll();
                int poll2 = pq.poll();
                calc(poll1, poll2);
            }else{
                return -1;
            }
        }
        
        return count;
    }
}