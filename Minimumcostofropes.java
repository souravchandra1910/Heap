import java.util.*;

public class Minimumcostofropes {
    long minCost(long arr[], int n) 
    {
       PriorityQueue<Long>pq=new PriorityQueue<>();
       for(int i=0;i<arr.length;i++){
           pq.add(arr[i]);
       }
       long ans=0;
       while(pq.size()>1){
           long a=pq.remove();
           long b=pq.remove();
           long sum=a+b;
           ans+=sum;
           pq.add(sum);
       }
       return ans;
    }
}