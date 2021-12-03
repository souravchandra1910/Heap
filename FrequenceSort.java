import java.util.*;

public class FrequenceSort {
    public int[] frequencySort(int[] nums) {
        int []ans=new int[nums.length];
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int val:nums){
            hm.put(val,hm.getOrDefault(val,0)+1);
        }
       PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int freq1 = hm.get(a);
            int freq2 = hm.get(b);
            
            return freq1 == freq2 ? b - a : freq1 - freq2;
        });
        
        for(int key:hm.keySet()){
            pq.add(key);
        }
        int idx=0;
        while(!pq.isEmpty()) {
            int num = pq.remove();
            int times =hm.get(num);
            
            while(times-- > 0) {
                ans[idx++] = num;
            }
        }
        return ans;
    }
}