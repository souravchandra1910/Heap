import java.util.*;

public class Sumofnumsbetweenk1andk2 {
    public static long sumBetweenTwoKth(long arr[], long N, long k1, long k2)
    {
       long a=ksmallest(arr,k1);
       long b=ksmallest(arr,k2);
       long sum=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]>a && arr[i]<b){
               sum+=arr[i];
           }
       }
       return sum;
       
    }
    public static long ksmallest(long[] arr,long k) 
	    { 
	      PriorityQueue<Long>pq=new PriorityQueue<>(Collections.reverseOrder());
	      for(int i=0;i<arr.length;i++){
	          if(i<k){
	              pq.add(arr[i]);
	          }
	          else{
	              if(pq.peek()>arr[i]){
	                  pq.remove();
	                  pq.add(arr[i]);
	              }
	          }
	      }
	      return pq.remove();
	    }   
}
