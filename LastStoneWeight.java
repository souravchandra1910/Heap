import java.util.*;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int val:stones){
            pq.add(val);
        }
        while(pq.size()>1){
            int y=pq.poll();
            int x=pq.poll();
            int diff=y-x;
            if(diff==0){
             //nothing to do
            }
            else{
                pq.add(diff);
            }
        }
        return pq.isEmpty()?0:pq.remove();
    }
}
