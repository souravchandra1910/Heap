import java.util.Collections;
import java.util.PriorityQueue;

public class KClosestPointstoOrigin {
    public class pair implements Comparable <pair>{
        int d;
        int x,y;
        
        pair(int d,int x,int y){
            this.d=d;
            this.x=x;
            this.y=y;
        }
        public int compareTo(pair o){
            return this.d-o.d;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<pair>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<points.length;i++){
            int x2=points[i][0];
            int y2=points[i][1];
            int d=(int)(Math.pow(x2,2))+(int)(Math.pow(y2,2));
            
        pq.add(new pair(d,x2,y2));
        if(pq.size() > k)
            pq.poll();
        }
        int [][]ans=new int[k][2];
        for(int i=0;i<k;i++){
            pair p=pq.remove();
            ans[i][0]=p.x;
            ans[i][1]=p.y;
        }
        return ans;
    }
}
