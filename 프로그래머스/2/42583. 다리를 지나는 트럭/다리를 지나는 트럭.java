import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        // init
        int answer = 1;
        int currentWeight = 0;
        int currentIdx = 1;
        
        Queue<Truck> queue = new LinkedList<>();
        Truck truck;
        
        truck = new Truck(truck_weights[0], 1, 1+bridge_length);
        queue.offer(truck);
        currentWeight += truck_weights[0];
        
        // 
        while( !queue.isEmpty() ){
            ++answer;
            // 다리에 있는 트럭이 다리를 건넜는지
            // 큐 이므로 맨앞만 체크한다
            truck = queue.peek();
            if(truck.endTime == answer){
                 queue.remove(truck);
                 currentWeight -= truck.truckWeight;
              } // if
            
            // 새로운 트럭이 다리를 건널 수 있는지
            if(currentIdx < truck_weights.length && currentWeight+truck_weights[currentIdx] <= weight){
                truck = new Truck(truck_weights[currentIdx], answer, answer + bridge_length);
                queue.offer(truck);
                currentWeight += truck_weights[currentIdx];
                currentIdx++;
            }
            
        } // while
        
        return answer;
    } // solution
    
    public class Truck{
        
        int truckWeight;
        int startTime;
        int endTime;
        
        public Truck(int truckWeight, int startTime, int endTime){
            this.truckWeight = truckWeight;
            this.startTime = startTime;
            this.endTime = endTime;
        }
        
    } // truck
}